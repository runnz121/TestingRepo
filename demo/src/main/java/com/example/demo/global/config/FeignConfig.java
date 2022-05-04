package com.example.demo.global.config;

import feign.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feginLogger() {
        return Logger.Level.BASIC;
    }
}
