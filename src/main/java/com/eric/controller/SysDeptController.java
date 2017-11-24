package com.eric.controller;

import com.eric.common.JsonData;
import com.eric.param.DeptParam;
import com.eric.service.SysDeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

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

    @RequestMapping("/save.json")
    @ResponseBody
    public JsonData saveDept(DeptParam param) {
        sysDeptService.save(param);
        return JsonData.success();
    }
}
