package com.zx.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description: com.zx.controller
 * @version: 1.0
 */
public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();

        //处理业务
        String result="hello springMVC!";
        mv.addObject("msg",result);
        //视图
        mv.setViewName("/hello");
        return mv;
    }
}
