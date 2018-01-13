package com.zhangwenit.servicefeign.hystrix;

import com.zhangwenit.servicefeign.service.TestService;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 熔断
 *
 * @author zhangwen at 2018-01-12 16:37
 **/
@Component
public class TestServiceHystrix implements TestService {

    @Override
    public String hi() {
        return "server error";
    }
}
