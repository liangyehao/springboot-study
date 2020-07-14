# springboot 初始化器： 
```java
public interface ApplicationContextInitializer<C extends ConfigurableApplicationContext>{
    void initialize(C applicationContext);
} 
```

## 三种实现方式

### （1）spring.factories文件配置使其生效
#### 1.实现org.springframework.context.ApplicationContextInitializer接口
#### 2.创建src\main\resources\META-INF\spring.factories文件
#### 3.spring.factories文件中配置键值对 接口=实现，```org.springframework.context.ApplicationContextInitializer=com.liang.initializer.FirstInitializer```

### （2）编码实现
#### 1.实现org.springframework.context.ApplicationContextInitializer接口
#### 2.手动创建启动类，并添加Initializer到启动类中 
```
// 手动new启动类
SpringApplication springApplication = new SpringApplication(SpringbootStudyApplication.class);
// 添加自定义initializer
springApplication.addInitializers(new SecondInitializer());
// 启动应用
springApplication.run(args);
```

### （3）yml文件配置实现