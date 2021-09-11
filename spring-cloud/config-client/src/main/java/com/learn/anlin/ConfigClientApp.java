package com.learn.anlin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class ConfigClientApp
{
    @Value("name")
    String name;

    @RequestMapping("/")
    public String home() {
        return "Hello " + name;
    }

    public static void main( String[] args )
    {
        SpringApplication.run(ConfigClientApp.class,args);
    }
}
