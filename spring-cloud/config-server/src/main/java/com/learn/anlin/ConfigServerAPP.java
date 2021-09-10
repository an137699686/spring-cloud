package com.learn.anlin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerAPP
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConfigServerAPP.class,args);
    }
}
