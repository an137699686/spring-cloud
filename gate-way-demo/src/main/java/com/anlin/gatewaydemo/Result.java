package com.anlin.gatewaydemo;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

/**
 * @author rayfoo@qq.com
 * @date 2020年8月6日
 */

public class Result implements Serializable {

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String  msg;

    /**
     * 数据记录
     */
    private Object data;

    /**
     * 构造方法
     * @param code 状态码
     * @param msg 提示信息
     */
    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 默认的成功方法
     */
    public static Result success(){
        return new Result(HttpStatus.OK.value(),HttpStatus.OK.name());
    }

    /**
     * 默认的成功方法
     * @param msg 成功时提示的信息
     */
    public static Result success(String msg){
        return new Result(HttpStatus.OK.value(),msg);
    }

    /**
     * 默认的失败方法
     */
    public static Result error(){
        return new Result(HttpStatus.INTERNAL_SERVER_ERROR.value(),HttpStatus.INTERNAL_SERVER_ERROR.name());
    }

    /**
     * 默认的失败方法
     * @param msg 失败时提示的信息
     */
    public static Result error(String msg){
        return new Result(HttpStatus.INTERNAL_SERVER_ERROR.value(),msg);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
