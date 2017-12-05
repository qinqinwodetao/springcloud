package com.wucy.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * Created by wucy on 2017/6/15.
 */


@SpringBootApplication
@EnableEurekaClient
public class MicroserviceProviderApplication {

    private static final Logger log = LoggerFactory.getLogger(MicroserviceProviderApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProviderApplication.class,args);
    }


    @Bean
    public CommandLineRunner demo() {

        log.info("log info...");
        log.debug("log debug...");
        log.trace("log trace...");
        log.warn("log warn...");
        log.error("log error...");

        return (args) -> log.info("CommandLineRunner Demo args: " + args);
    }

}
