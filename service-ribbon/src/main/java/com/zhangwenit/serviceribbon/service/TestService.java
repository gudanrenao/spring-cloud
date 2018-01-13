package com.zhangwenit.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 测试
 *
 * @author zhangwen at 2018-01-12 15:29
 **/
@Service
public class TestService {

    private final RestTemplate restTemplate;

    public TestService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @HystrixCommand(fallbackMethod = "fallback")
    public String test() {
        return restTemplate.getForObject("http://SERVICE-CLIENT/hi", String.class);
    }

    public String fallback(){
        return "sorry,error!";
    }
}
