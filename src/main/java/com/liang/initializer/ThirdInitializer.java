package com.liang.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;

@Order(3)
public class ThirdInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    /**
     * Initialize the given application context.
     *
     * @param applicationContext the application to configure
     */
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        Map<String,Object> map = new HashMap<>();
        map.put("key3","value3");
        MapPropertySource mapPropertySource = new MapPropertySource("thirdInitializer", map);
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        environment.getPropertySources().addLast(mapPropertySource);
        // TODO application.yml中配置的initializer会优先执行，Order不起作用
        System.out.println("------ThirdInitializer 自定义初始化器 3 ------");
    }
}
