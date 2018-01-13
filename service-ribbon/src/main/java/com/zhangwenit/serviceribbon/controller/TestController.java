package com.zhangwenit.serviceribbon.controller;

import com.zhangwenit.serviceribbon.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author zhangwen at 2018-01-12 15:31
 **/
@RestController
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @Value("${test}")
    private String test;

    @GetMapping("read")
    public String read() {
        return test;
    }

    @GetMapping("/test")
    public String test() {
        return testService.test();
    }
}
