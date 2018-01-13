package com.zhangwenit.servicefeign.controller;

import com.zhangwenit.servicefeign.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author zhangwen at 2018-01-12 15:59
 **/
@RestController
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/feignTest")
    public String feignTest() {
        return testService.hi();
    }
}
