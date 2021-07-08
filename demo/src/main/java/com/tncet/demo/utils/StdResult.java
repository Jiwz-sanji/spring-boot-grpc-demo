package com.tncet.demo.utils;

import com.alibaba.fastjson.JSONObject;
import com.tncet.demo.enums.StdStatus;

import java.io.Serializable;


/**
 * Json的标准输出格式
 * @param <T>
 */
public class StdResult<T> implements Serializable
{

    private static final long serialVersionUID = -3373951637251223076L;
    private int status;
    private String message;
    private T data;

    public StdResult(StdStatus statEnum, T data)
    {
        this.status = statEnum.getStatus();
        this.message = statEnum.getStatusInfo();
        this.data = data;
    }

    public String toJsonString(){
        JSONObject json = new JSONObject();
        json.put("status", status);
        json.put("message", message);
        json.put("data",data);
        return json.toJSONString();
    }

    public Object toJson(){
        JSONObject json = new JSONObject();
        json.put("status", status);
        json.put("message", message);
        json.put("data",data);
        return json;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public Object getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }
}
