package com.liang.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;

@Order(2)
public class SecondInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    /**
     * Initialize the given application context.
     *
     * @param applicationContext the application to configure
     */
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("------SecondInitializer 自定义初始化器 2 ------");
    }
}
