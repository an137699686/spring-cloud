package com.anlin.nacosClientDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 加入下面这个注解，开始扫描 FeignClient
@EnableFeignClients
@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class NacosClientCommonApplication {
    // 注入服务的接口，需要把服务的接口声明在这个服务的项目中，实现还是在 nacos-server 中
    @Autowired
    private FeignService feignService;

    public static void main(String[] args) {
        SpringApplication.run(NacosClientCommonApplication.class, args);
    }
    /**
     * 依赖 spring-cloud-starter-openfeign
     *
     * @return
     */
    @GetMapping("/test3")
    public String test3() {
        return feignService.hello("spring cloud");
    }
}