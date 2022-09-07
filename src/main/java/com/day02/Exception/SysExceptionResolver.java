package com.day02.Exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SysExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        String message = null;
        if(e instanceof SysException)
        {
            e = (SysException)e;
            message = e.getMessage();
        }else {
            message = "系统维护中！";
        }
        ModelAndView mv = new ModelAndView();
        mv.addObject("message",message);
        mv.setViewName("error");
        return mv;
    }
}
