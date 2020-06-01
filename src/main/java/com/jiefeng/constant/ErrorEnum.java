package com.jiefeng.constant;

import com.xdap.motor.exception.BaseExceptionEnumInterface;

public enum ErrorEnum implements BaseExceptionEnumInterface {
    PHONE_EMPTY("1000","PHONE_EMPTY")
    ;

    private String code;
    private String message;

    ErrorEnum(String code, String message){
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return null;
    }

}