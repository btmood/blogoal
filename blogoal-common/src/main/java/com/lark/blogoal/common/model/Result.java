package com.lark.blogoal.common.model;

import com.lark.blogoal.common.constant.ResponseCodeEnum;
import lombok.Data;

/**
 * @author btmood
 * @date 2021-11-25 16:28
 * @Description TODO
 */
@Data
public class Result {

    private boolean success;
    private int code;
    private String message;
    private Object data;

    public static Result success() {
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(ResponseCodeEnum.SUCCESS.getCode());
        result.setMessage(ResponseCodeEnum.SUCCESS.getDesc());
        return result;
    }

    public static Result success(Object data) {
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(ResponseCodeEnum.SUCCESS.getCode());
        result.setMessage(ResponseCodeEnum.SUCCESS.getDesc());
        result.setData(data);
        return result;
    }

    public static Result success(String message) {
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(ResponseCodeEnum.SUCCESS.getCode());
        result.setMessage(message);
        return result;
    }

    public static Result error() {
        Result result = new Result();
        result.setSuccess(false);
        result.setCode(ResponseCodeEnum.FAIL.getCode());
        result.setMessage(ResponseCodeEnum.FAIL.getDesc());
        return result;
    }

    public static Result error(String message) {
        Result result = new Result();
        result.setSuccess(false);
        result.setCode(ResponseCodeEnum.FAIL.getCode());
        result.setMessage(message);
        return result;
    }

    public static Result error(ResponseCodeEnum responseCodeEnum) {
        Result result = new Result();
        result.setSuccess(false);
        result.setCode(responseCodeEnum.getCode());
        result.setMessage(responseCodeEnum.getDesc());
        return result;
    }
}
