package com.chen.study;

import com.chen.study.annotation.MyTestAnnotation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringbootDemo6Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemo6Application.class, args);
    }
}
