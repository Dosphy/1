package com.onlineorder.onlineordersystem.model.pojo;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Result<T> {
    private Integer code;    // 状态码
    private String message; // 返回消息
    private T data;         // 返回数据

//    public static <T> Result<T> success(T data) {
//        return new Result<>(200, "成功", data);
//    }
//
//    public static <T> Result<T> error(Integer code, String message) {
//        return new Result<>(code, message, null);
//    }
}