package com.chen.study.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
//@RequestMapping("${server.error.path:${error.path:/error}}")
@RequestMapping("/error")
public class TestErrorController implements ErrorController {

    @Override
    public String getErrorPath() {
        // 默认返回值null即可
        return null;
    }

    @RequestMapping
    public Map<String,Object> handleError(){
        Map<String,Object> map = new HashMap<>();
        map.put("code",404);
        map.put("msg","不存在");
        return map;
    }

    @RequestMapping("/ok")
    @ResponseBody
    public Map<String,Object> noError(){
        Map<String,Object> map = new HashMap<>();
        map.put("code",200);
        map.put("msg","正常，这是一个测试页面");
        return map;
    }

    @RequestMapping(value = "/error",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String errorHtml404(HttpServletRequest request, HttpServletResponse response){
        return "404 错误，不存在";
    }

    @RequestMapping(value = "/error",consumes = "application/json;charset=UTF-8",produces = "application/json;charset=UTF-8")
    public Map<String,Object> errorJson(){
        Map<String,Object> map = new HashMap<>();
        map.put("code",404);
        map.put("msg","不存在");
        return map;
    }
}
