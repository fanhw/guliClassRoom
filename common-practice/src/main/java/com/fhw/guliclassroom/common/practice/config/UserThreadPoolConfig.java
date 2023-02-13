package com.fhw.guliclassroom.common.practice.config;

import com.fhw.guliclassroom.common.practice.thread.ThreadPoolDemo.RejectedExecutionHandlerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskDecorator;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author fhw
 * @version 1.0
 * @date 2023-02-01 11:46
 */


@Configuration
public class UserThreadPoolConfig {

    @Bean
    public ThreadPoolTaskExecutor threadPoolTaskExecutor() {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(2);
        threadPoolTaskExecutor.setMaxPoolSize(4);
        threadPoolTaskExecutor.setAllowCoreThreadTimeOut(false);
        threadPoolTaskExecutor.setKeepAliveSeconds(4);
        threadPoolTaskExecutor.setQueueCapacity(2);
        threadPoolTaskExecutor.setRejectedExecutionHandler(new RejectedExecutionHandlerImpl());
        threadPoolTaskExecutor.setThreadFactory(Executors.defaultThreadFactory());
        return threadPoolTaskExecutor;
    }
}
