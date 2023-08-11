package org.jboost.basic.common.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Description: Unified general return result
 * Created by EXCaster on 2023/3/2
 */
public class CommonResult<R> {

    private long code;
    private String message;
    private boolean success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private R data;

    private CommonResult(long code, boolean success, String message, R data) {
        this.code = code;
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public static <R> CommonResult<R> success() {
        return new CommonResult<>(ResultCode.SUCCESS.getCode(), true, ResultCode.SUCCESS.getMessage(), null);
    }

    public static <R> CommonResult<R> success(R data) {
        return new CommonResult<>(ResultCode.SUCCESS.getCode(), true, ResultCode.SUCCESS.getMessage(), data);
    }

    public static <R> CommonResult<R> success(String message) {
        return new CommonResult<>(ResultCode.SUCCESS.getCode(), true, message, null);
    }

    public static <R> CommonResult<R> failure(String message) {
        return new CommonResult<>(ResultCode.FAILED.getCode(), false, message, null);
    }

    public static <R> CommonResult<R> failure(ResultCode resultCode) {
        return new CommonResult<>(resultCode.getCode(), false, resultCode.getMessage(), null);
    }

    public static <R> CommonResult<R> failure(ResultCode resultCode, R data) {
        return new CommonResult<>(resultCode.getCode(), false, resultCode.getMessage(), data);
    }

    public Long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public R getData() {
        return data;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(R data) {
        this.data = data;
    }


    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {this.success = success;}

}
