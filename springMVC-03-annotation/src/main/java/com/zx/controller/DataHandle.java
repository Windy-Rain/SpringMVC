package com.zx.controller;

import com.zx.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description: com.zx.controller
 * @version: 1.0
 */
@Controller
public class DataHandle {

    /*
    提交的域名称和处理方法的参数名一致
    提交数据 :http://localhost:8081/springMVC_annotation/handle1?name=zx
     */
    @RequestMapping("/handle1")
    public void handle1(String name){
        System.out.println("handle1:"+name);
    }
    /*
    提交的域名称和处理方法的参数名不一致
    提交数据 :http://localhost:8081/springMVC_annotation/handle1?username=zx
     */
    @RequestMapping("/handle2")
    public void handle2(@RequestParam("username") String name){
        System.out.println("handle2:"+name);
    }
    /*
    提交的是一个对象
    要求提交的表单域和对象的属性名一致 , 参数使用对象即可
    提交数据 :http://localhost:8081/springMVC_annotation/handle1?id=2&username=zx&pwd=root
     */
    @RequestMapping("/handle3")
    public void handle3(User user){
        System.out.println(user);
    }
}
