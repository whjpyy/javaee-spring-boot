package com.chen.learn.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService bean = context.getBean(BeanWayService.class);
        JSR250WayService jsr250 = context.getBean(JSR250WayService.class);
        context.close();
    }
}
