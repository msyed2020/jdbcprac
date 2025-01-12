package com.mikailexample.config;

import com.mikailexample.Terra;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    
    public Terra terra() {
        return new Terra();
    }
}
