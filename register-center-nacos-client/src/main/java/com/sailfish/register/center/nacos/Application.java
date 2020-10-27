package com.sailfish.register.center.nacos;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.api.naming.NamingService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author XIAXINYU3
 * @date 2020/10/27
 */
@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class Application {

    @NacosInjected
    private NamingService namingService;

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    private Integer serverPort;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @NacosValue(value = "${service.name:1}", autoRefreshed = true)
    private String serverName;

    @RequestMapping(value = "/test", method = GET)
    @ResponseBody
    public String get() {
        return serverName;
    }
}

