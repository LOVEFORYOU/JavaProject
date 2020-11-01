package com.lsl.sbdemo01.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    // 显示在浏览器上需增加注解
    @ResponseBody
    // 请求注解
    @RequestMapping("/helloWorld")
    public String HelloWorld(){
        return "Hello World!";
    }
}
