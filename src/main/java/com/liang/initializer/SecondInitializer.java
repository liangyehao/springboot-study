package com.liang.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;

@Order(2)
public class SecondInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    /**
     * Initialize the given application context.
     *
     * @param applicationContext the application to configure
     */
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        Map<String,Object> map = new HashMap<>();
        map.put("key2","value2");
        MapPropertySource mapPropertySource = new MapPropertySource("secondInitializer", map);
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        environment.getPropertySources().addLast(mapPropertySource);
        System.out.println("------SecondInitializer 自定义初始化器 2 ------");
    }
}
