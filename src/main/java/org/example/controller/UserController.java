package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    //设置当前访问路径，使用@RequestMapping
    @RequestMapping("/save")
    //设置当前对象的返回值类型
    @ResponseBody
    public String save(){
        System.out.println("user save ...");
        return "{'module':'SpringMVC'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(){
        System.out.println("user delete ..");
        return "{'module':'user delete'}";
    }
}
