package com.chen.study.log;

import com.chen.study.annotation.MyTestAnnotation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class TesAnnotationAspect {

    @Pointcut("@annotation(com.chen.study.annotation.MyTestAnnotation)")
    public void myAnnotationPointCut(){

    }

    @Before("myAnnotationPointCut()")
    public void before(JoinPoint joinPoint) throws Exception{
        MethodSignature sign = (MethodSignature) joinPoint.getSignature();
        Method method = sign.getMethod();
        MyTestAnnotation annotation = method.getAnnotation(MyTestAnnotation.class);
        System.out.println("TestAnnotation 参数： " + annotation.value());
    }
}
