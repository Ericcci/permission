package com.eric.service;

import com.eric.dao.SysDeptMapper;
import com.eric.exception.ParamException;
import com.eric.model.SysDept;
import com.eric.param.DeptParam;
import com.eric.util.BeanValidator;
import com.eric.util.LevelUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * SysDeptService
 *
 * @author Eric
 * @date 2017/11/24
 */
@Service
public class SysDeptService {

    @Resource
    private SysDeptMapper sysDeptMapper;

    public void save(DeptParam param) {
        BeanValidator.check(param);
        if (checkExist(param.getParentId(), param.getName(), param.getUuid())) {
            throw new ParamException("同一层级下存在相同名称的部门");
        }
        SysDept dept = SysDept.builder().name(param.getName()).parentId(param.getParentId()).seq(param.getSeq()).remark(param.getRemark()).build();
        dept.setLevel(LevelUtil.calculateLevel(getLevel(param.getParentId()), param.getParentId()));
        // TODO:
        dept.setOperator("SYSTEM");
        // TODO:
        dept.setOperatorIp("127.0.0.1");
        // TODO:
        dept.setOperatorTime(new Date());

        sysDeptMapper.insertSelective(dept);
    }

    private boolean checkExist(Integer parentId, String deptName, Integer deptId) {
        // TODO:
        return true;
    }

    private String getLevel(Integer deptId) {
        SysDept dept = sysDeptMapper.selectByPrimaryKey(deptId);
        if (dept == null) {
            return null;
        }
        return dept.getLevel();
    }
}
