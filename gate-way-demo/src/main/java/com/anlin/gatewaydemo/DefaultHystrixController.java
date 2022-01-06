package com.anlin.gatewaydemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rayfoo@qq.com
 * @version 1.0
 * <p></p>
 * @date 2021/1/19 12:35
 */
@RestController
public class DefaultHystrixController {
    @RequestMapping(value = "/fallback",method = RequestMethod.GET)
    public Result fallback(){
        System.out.println("fallback****************Gateway");
        return new Result(500,"您访问的接口超时。。。");
    }
}
