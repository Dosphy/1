package com.onlineorder.onlineordersystem.model.pojo;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Result {
    private Integer code;    // 状态码
    private String message; // 返回消息
    private Object data;         // 返回数据

    public Result() {
    }

    public Result(Integer code,Object data) {
        this.code = code;
        this.data = data;
    }

    public Result(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}