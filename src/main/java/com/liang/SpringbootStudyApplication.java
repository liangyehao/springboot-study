package com.liang;

import com.liang.initializer.SecondInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootStudyApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringbootStudyApplication.class, args);
        SpringApplication springApplication = new SpringApplication(SpringbootStudyApplication.class);
        springApplication.addInitializers(new SecondInitializer());
        springApplication.run(args);
    }

}
