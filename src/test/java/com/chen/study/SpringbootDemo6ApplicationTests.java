package com.chen.study;

import com.chen.study.annotation.MyTestAnnotation;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootDemo6ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    @MyTestAnnotation("测试Annotationce参数")
    public void testAnnotation(){

    }

}
