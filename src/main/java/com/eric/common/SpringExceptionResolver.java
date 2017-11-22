package com.eric.common;

import com.eric.exception.ParamException;
import com.eric.exception.PermissionException;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class SpringExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) {
        String url = request.getRequestURL().toString();
        ModelAndView mv;
        String defaultMsg = "System Error";
        String endsWithJson = ".json";
        String endsWithPage = ".page";

        //要求请求json数据,都是用.json结尾
        if (url.endsWith(endsWithJson)) {
            if (e instanceof PermissionException || e instanceof ParamException) {
                JsonData result = JsonData.fail(e.getMessage());
                mv = new ModelAndView("jsonView", result.toMap());
            } else {
                log.error("unknown json exception, url:" + url, e);
                JsonData result = JsonData.fail(defaultMsg);
                mv = new ModelAndView("jsonView", result.toMap());
            }
            //要求请求page数据,都是用.page结尾
        } else if (url.endsWith(endsWithPage)) {
            log.error("unknown page exception, url:" + url, e);
            JsonData result = JsonData.fail(defaultMsg);
            mv = new ModelAndView("exception", result.toMap());
        } else {
            log.error("unknown exception, url:" + url, e);
            JsonData result = JsonData.fail(defaultMsg);
            mv = new ModelAndView("jsonView", result.toMap());
        }

        return mv;
    }
}
