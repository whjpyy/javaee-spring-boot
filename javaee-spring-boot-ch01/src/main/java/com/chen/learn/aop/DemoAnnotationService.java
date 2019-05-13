package com.chen.learn.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {
    @Action(name = "注解拦截的add操作")
    public void add(){
        System.out.println("DemoAnnotationService 的add方法");
    }
}
