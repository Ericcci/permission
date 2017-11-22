package com.eric.common;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * <b>Description:</b><br>
 *
 * @author Eric.
 * @version 1.0
 *          <b>ProjectName:</b> permission
 *          <br><b>PackageName:</b> com.eric.common
 *          <br><b>Date:</b> 2017/11/22 11:36
 */
public class SpringExceptionResolver implements HandlerExceptionResolver{
    
    @Override
    public ModelAndView resolveException(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o, Exception e) {
        return null;
    }
}
