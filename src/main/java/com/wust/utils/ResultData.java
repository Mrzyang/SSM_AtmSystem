package com.wust.utils;

public class ResultData {
    private int status;
    private int message;
    private Object object;

    public ResultData() {
    }

    public ResultData(int status, int message, Object object) {
        this.status = status;
        this.message = message;
        this.object = object;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "ResultData{" +
                "status=" + status +
                ", message=" + message +
                ", object=" + object +
                '}';
    }
}
