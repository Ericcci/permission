package com.eric.dto;

import com.eric.model.SysDept;
import com.google.common.collect.Lists;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * DeptLevelDto
 *
 * @author Eric
 * @date 2017/11/26
 */
@Getter
@Setter
@ToString
public class DeptLevelDto extends SysDept {

    private List<DeptLevelDto> deptList = Lists.newArrayList();

    public static DeptLevelDto adapt(SysDept dept) {
        DeptLevelDto dto = new DeptLevelDto();
        //完成两个类相同字段的copy
        BeanUtils.copyProperties(dept, dto);
        return dto;
    }

}
