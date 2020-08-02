package com.chen.study.controller;

import com.chen.study.exception.BusinessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestExceptionController {

    @RequestMapping("/businessException")
    public String testExceptionHandler(@RequestParam("i") int i){
        if (i == 0){
            throw new BusinessException(600,"自定义业务错误");
        }
        return "success";
    }
}
