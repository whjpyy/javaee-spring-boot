package com.chen.learn.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ResourceConfig.class);
        ELConfig el = context.getBean(ELConfig.class);
        el.outputResource();
        context.close();
    }
}
