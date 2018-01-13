package com.zhangwenit.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 读取配置
 * 自动刷新配制文件（广播配置文件热更改），需在对应获取配置属性的类上加@RefreshScope
 * <p>
 * 使用 /bus/refresh?destination=customers:** 刷新（customers服务名，**表示所有服务，不管ip）
 *
 * @author zhangwen at 2018-01-13 11:44
 **/
@RefreshScope
@RestController
public class TestController {

    @Value("${democonfigclient.message}")
    String message;

    @GetMapping("/read")
    public String readConfig() {
        return message;
    }
}
