package com.anlin.nacosClientDemo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// 注解指定了这个接口调用服务的名称
@FeignClient("nacos-server")
interface FeignService {

    @GetMapping("/hello")
    String hello(@RequestParam String name);
}
