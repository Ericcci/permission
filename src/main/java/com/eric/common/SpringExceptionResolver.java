package com.eric.common;

import com.eric.exception.PermissionException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <b>Description:异常处理类</b><br>
 *
 * @author Eric.
 * @version 1.0
 *          <b>ProjectName:</b> permission
 *          <br><b>PackageName:</b> com.eric.common
 *          <br><b>Date:</b> 2017/11/22 11:36
 */
public class SpringExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) {
        String url = request.getRequestURL().toString();
        ModelAndView mv;
        String defaultMsg = "System Error";

        if (url.endsWith(".json")) {
if (e instanceof PermissionException) {
    JsonData result = JsonData.fail(((PermissionException) e).getMessage());
}
        } else {

        }

        return null;
    }
}
