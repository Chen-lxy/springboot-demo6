package com.chen.study.handler;

import com.chen.study.exception.BusinessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice // 异常处理切面
public class CustomBusinessExceptionHandler {

    @ResponseBody
    @ExceptionHandler(BusinessException.class)  // 处理抛出的异常类型
    public Map<String,Object> businessExceptionHandler(BusinessException e){
        Map<String,Object> map = new HashMap<>();
        map.put("code",e.getCode());
        map.put("msg",e.getMessage());
        return map;
    }
}
