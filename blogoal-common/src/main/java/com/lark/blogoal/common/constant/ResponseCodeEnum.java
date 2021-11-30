package com.lark.blogoal.common.constant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author btmood
 * @date 2021-11-25 16:43
 * @Description TODO
 */
@Getter
@AllArgsConstructor
public enum ResponseCodeEnum {

    FAIL(10000,"操作失败"),
    UNAUTHENTICATED(10001,"您还未登录"),
    INSUFFICIENT_PERMISSION(10002, "权限不足"),
    OTHER_ERROR(10003,"未知异常"),
    SERVER_ERROR(99999,"抱歉，系统繁忙，请稍后重试"),

    SUCCESS(20000, "成功"),
    NAME_OR_PASSWORD_ERROR(20001, "用户名或密码错误"),
    REQUEST_ARGUMENTS_ERROR(20002, "请求参数错误");



    private int code;
    private String desc;




}
