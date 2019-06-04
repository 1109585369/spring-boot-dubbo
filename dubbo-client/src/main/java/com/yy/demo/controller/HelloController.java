package com.yy.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yy.demo.dubbo.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yy
 * @ProjectName spring-boot-dubbo
 * @Description: TODO
 * @date 2019/6/2 10:44
 */
@Controller
public class HelloController {

    @Reference
    HelloService helloService;

    @ResponseBody
    @RequestMapping("/sayHello")
    public String sayHello(String name){
        return helloService.sayHello(name);
    }

}
