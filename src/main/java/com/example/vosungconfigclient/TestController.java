package com.example.vosungconfigclient;

import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获取配置中心config-file的相关配置信息
 * 加@RefreshScope是为了可以动态刷新这个Controller的Bean
 */
@RefreshScope
@RestController
public class TestController {

//    @Autowired
//    private Environment environment;

    @Value("${from}")
    private String from;
    @Value("${authzFilterEnabled}")
    private boolean authzFilterEnabled;

    @RequestMapping("/from")
    public String from() {
        return this.from;
    }

    @RequestMapping("/authzFilterEnabled")
    public boolean authzFilterEnabled() {
        return this.authzFilterEnabled;
    }
}
