package com.anlin.nacosClientDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class NacosClientDemoApplication {

    // 需要@Autowired注入
    @Autowired
    private RestTemplate restTemplate;

    public static void main(String[] args) {
        SpringApplication.run(NacosClientDemoApplication.class, args);
    }



    /**
     * 2. Spring Cloud中对RestTemplate做了增强，只需要稍加配置，就能简化之前的调用方式
     * @return
     */
    @GetMapping("/test1")
    public String test1() {
        return restTemplate.getForObject("http://nacos-server/hello?name=kangkang", String.class);
    }






}
