package com.xiaoyun.utils;

public class CopyDataException extends Exception {

    public CopyDataException(){super(); }
    public CopyDataException(String message){
        super(message);

    }
    public CopyDataException(String message, Throwable cause){

        super(message,cause);
    }

    //用指定原因构造一个新的异常
    public CopyDataException(Throwable cause) {

        super(cause);
    }

}
