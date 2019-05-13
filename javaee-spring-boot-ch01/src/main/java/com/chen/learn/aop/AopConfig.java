package com.chen.learn.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.chen.learn.aop")
@EnableAspectJAutoProxy // 开启Spring对AspectJ代理支持
public class AopConfig {

}
