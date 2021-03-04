package com.zx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @Description: com.zx.controller
 * @version: 1.0
 */
//乱码问题！！！
@Controller
public class TestForm {
    @RequestMapping("/testForm")
    public String testForm(@RequestParam("msg") String msg, Model model){
        System.out.println(msg);
        System.out.println(msg.getBytes().length);
        try {
            System.out.println(msg.getBytes("ISO-8859-1").length);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println("===========-============");

        try {
            String s = new String(msg.getBytes("ISO-8859-1"), "UTF-8");
            System.out.println(s);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        model.addAttribute("msg",msg);
        return "hello";
    }
}
