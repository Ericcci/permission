package com.eric.controller;

import com.eric.common.JsonData;
import com.eric.dto.DeptLevelDto;
import com.eric.param.DeptParam;
import com.eric.service.SysDeptService;
import com.eric.service.SysTreeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * SysDeptController
 *
 * @author Eric
 * @date 2017/11/24
 */
@Controller
@RequestMapping("sys/dept")
@Slf4j
public class SysDeptController {

    @Resource
    private SysDeptService sysDeptService;
    @Resource
    private SysTreeService sysTreeService;

    @RequestMapping("/save.json")
    @ResponseBody
    public JsonData saveDept(DeptParam param) {
        sysDeptService.save(param);
        return JsonData.success();
    }

    @RequestMapping("/tree.json")
    @ResponseBody
    public JsonData tree(){
        List<DeptLevelDto> dtoList = sysTreeService.deptTree();
        return JsonData.success(dtoList);
    }
}
