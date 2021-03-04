package com.zx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: com.zx.controller
 * @version: 1.0
 */
@Controller
@RequestMapping("/helloController")
public class HelloController {

    // localhost:8081/springMVC-annotation/helloController/hello
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg","你好 springmvc!");
        return "hello";
    }
}
