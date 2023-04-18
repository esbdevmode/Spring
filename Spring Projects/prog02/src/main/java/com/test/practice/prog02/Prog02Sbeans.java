package com.test.practice.prog02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Prog02Sbeans {
    
    @Bean(name = "mynature")
    public String nature() {
        return "I am a Bean method";
    }
}
