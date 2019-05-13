package com.chen.learn.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public DemoService devDemoBean(){
        return new DemoService("from development profile");
    }

    @Bean
    @Profile("prod")
    public DemoService prodDemoBean(){
        return new DemoService("from production profile");
    }
}
