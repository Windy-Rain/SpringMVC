package com.zx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: com.zx.controller
 * @version: 1.0
 */
@Controller
public class TestController {
    @RequestMapping("/testView")
    public String testView(Model model){
        model.addAttribute("msg","testView");
//        return "forward:/WEB-INF/jsp/hello.jsp";//转发
        return "redirect:/WEB-INF/jsp/hello.jsp";//重定向
//        return "redirect:/index.jsp";
    }
}
