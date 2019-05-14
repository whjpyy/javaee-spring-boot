package com.chen.learn.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.chen.learn")
@EnableScheduling // 开启定时任务
public class TaskSchedulerConfig {
}
