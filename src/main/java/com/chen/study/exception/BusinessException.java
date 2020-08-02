package com.chen.study.exception;
// 自定义异常类
public class BusinessException extends RuntimeException {
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public BusinessException(int code, String msg){
        super(msg);
        this.code = code;
    }


}
