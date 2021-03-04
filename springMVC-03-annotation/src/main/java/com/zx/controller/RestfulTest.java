package com.zx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: com.zx.controller
 * @version: 1.0
 */
@Controller
public class RestfulTest {
    //@RequestMapping(value = "/test1/{i}/{j}",method = RequestMethod.GET)
    @PostMapping("/test1/{i}/{j}")
    public String test1(@PathVariable int i,@PathVariable String j, Model model){
        model.addAttribute("msg","test1计算结果："+i+j);
        return "hello";
    }
    @GetMapping("/test1/{i}/{j}")
    public String test2(@PathVariable int i,@PathVariable String j,Model model){
        model.addAttribute("msg","test2计算结果："+i+j);
        return "hello";
    }
}
