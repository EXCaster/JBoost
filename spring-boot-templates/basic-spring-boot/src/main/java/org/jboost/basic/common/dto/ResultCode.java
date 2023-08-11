package org.jboost.basic.common.dto;

/**
 * Description: result code enumeration
 * Created by EXCaster on 2023/8/2
 */
public enum ResultCode {
    SUCCESS(200, "Success"),
    FAILED(400,"Failed");

    private long code;
    private String message;

    ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
