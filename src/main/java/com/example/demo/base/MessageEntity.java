package com.example.demo.base;
/**
 * 消息体 <br>
 *     code = 0 是成功，其它都是失败
 *
 * @author dutianzhao
 * @date 2017-09-07
 */
public class MessageEntity<T> extends AbstractEntity {

    private String code;
    private String message;
    private T data;

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

    public boolean isSuccess(){
        if ("0".equalsIgnoreCase(code)) {
            return true;
        }
        return false;
    }

    public boolean isFail(){
        return !isSuccess();
    }

}
