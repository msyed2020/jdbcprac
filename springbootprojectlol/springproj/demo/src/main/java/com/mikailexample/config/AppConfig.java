package com.mikailexample.config;

import com.mikailexample.Terra;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    
    @Bean
    @Scope("prototype")
    public Terra terra() {
        Terra terra = new Terra();
        terra.setPercentAwesome(100);
        System.out.println(terra.getPercentAwesome());
        return terra;
    }
}
