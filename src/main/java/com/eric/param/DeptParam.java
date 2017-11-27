package com.eric.param;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * DeptParam
 *
 * @author Eric
 * @date 2017/11/24
 */

@Getter
@Setter
@ToString
public class DeptParam {

    private Integer uuid;

    @NotBlank(message = "部门名称不能为空")
    private String name;

    private Integer parentId;

    @NotNull(message = "展示顺序不能为空")
    private Integer seq;

    @Length(max = 150, message = "备注的长度不能超过150个字")
    private String remark;
}
