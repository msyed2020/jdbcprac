package com.mikailexample.config;

import com.mikailexample.Terra;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class AppConfig {
    
    @Bean
    public Terra terra() {
        return new Terra();
    }
}
