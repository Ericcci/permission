package com.eric.controller;

import com.eric.common.JsonData;
import com.eric.exception.ParamException;
import com.eric.exception.PermissionException;
import com.eric.param.TestVo;
import com.eric.util.BeanValidator;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.MapUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * <b>Description:</b><br>
 *
 * @author Eric.
 * @version 1.0
 *          <b>ProjectName:</b> permission
 *          <br><b>PackageName:</b> com.eric.controller
 *          <br><b>Date:</b> 2017/11/21 17:47
 */

@Controller
@RequestMapping("/test")
@Slf4j
public class TestController {

    @RequestMapping("/hello.json")
    @ResponseBody
    public JsonData hello() {
        log.info("hello");
        throw new RuntimeException("text exception");
        //return JsonData.success("hello permission");
    }

    @RequestMapping("/validator.json")
    @ResponseBody
    public JsonData validator(TestVo vo) throws ParamException{
        log.info("validator");
        BeanValidator.check(vo);
        return JsonData.success("test validator");
    }
}
