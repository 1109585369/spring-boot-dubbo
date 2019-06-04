package com.yy.demo.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yy.demo.dubbo.HelloService;

/**
 * @author yy
 * @ProjectName springboot-dubbo-server
 * @Description: TODO
 * @date 2019/6/2 10:29
 */

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "hello," + name;
    }
}
