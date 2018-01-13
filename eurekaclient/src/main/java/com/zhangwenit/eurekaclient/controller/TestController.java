package com.zhangwenit.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * test
 *
 * @author zhangwen at 2018-01-12 15:05
 **/
@RestController
public class TestController {

    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String index() {
        return "hi ,i am from port:" + port;
    }
}
