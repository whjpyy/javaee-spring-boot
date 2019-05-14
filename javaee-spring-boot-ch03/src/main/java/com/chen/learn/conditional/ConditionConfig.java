package com.chen.learn.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {
    @Bean
    @Conditional(WindowCondition.class)
    public ListService windowListService(){
        return new WindowListService();
    }

    @Bean
    @Conditional(LinuxConidtion.class)
    public ListService linuxListService(){
        return new LinuxListService();
    }
}
