package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/book")
public class BookController {
    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(@RequestParam("username") String name){
        System.out.println("普通参数传递name -->" + name);
        return "{'module':'commonParam'}";
    }

    @RequestMapping("/toJumpPage")
    //注意
    //1.此处不能添加@ResponseBody,如果加了该注入，会直接将page.jsp当字符串返回前端
    //2.方法需要返回String
    public String toJumpPage(){
        System.out.println("跳转页面");
        return "/page/page.jsp";
    }
}
