package com.subocol.mastercrash.util;

public class ResponseModel<T> {
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private T data;
}
