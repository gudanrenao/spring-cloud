package com.zhangwenit.servicefeign.service;

import com.zhangwenit.servicefeign.hystrix.TestServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "service-client", fallback = TestServiceHystrix.class)
public interface TestService {

    @GetMapping("/hi")
    String hi();
}
