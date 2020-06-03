package com.lawans.pet.entity;

/**
 * 接口返回基础类
 * code 错误码
 * code 0000==成功
 * message 错误信息
 */
public class BaseResult<T>{
    String code;
    String message;

    T data;

    public BaseResult(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public BaseResult(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public BaseResult(String code, T data) {
        this.code = code;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    //返回错误信息
    public static <T> BaseResult<T> createByError(String msg, String code){
        return new BaseResult<>(msg,code);
    }

    //返回数据
    public static <T> BaseResult<T> createByData(String code,T data){
        return new BaseResult<>(code,data);
    }

    //返回无实体数据
    public static BaseResult createByData(String code,String msg){
        return new BaseResult(code,msg);
    }

    @Override
    public String toString() {
        return "BaseResult{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
