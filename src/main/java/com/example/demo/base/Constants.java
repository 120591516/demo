package com.example.demo.base;



/**
 * 常量定义
 * @see
 *
 * @author dutianzhao
 * @date 2017-09-07
 */
public class Constants {

    /**
     * MessageEntity成功时返回的code
     */
    public static final String MESSAGE_SUCCESS_CODE = "0";

    /**
     * MessageEntity成功时返回的message
     */
    public static final String MESSAGE_SUCCESS_MESSAGE = "操作成功";

    /**
     * MessageEntity失败时默认返回的code
     */
    public static final String MESSAGE_DEFAULT_FAIL_CODE = "1";

    /**
     * MessageEntity失败时默认返回的message
     */
    public static final String MESSAGE_DEFAULT_FAIL_MESSAGE = "失败";

    /**
     * MessageEntity参数错误时默认返回的code
     */
    public static final String MESSAGE_DEFAULT_PARAM_ERROR_CODE = "400";

    /**
     * MessageEntity参数错误时默认返回的message
     */
    public static final String MESSAGE_DEFAULT_PARAM_ERROR_MESSAGE = "参数错误";

    /**
     * MessageEntity资源不存在时默认返回的code
     */
    public static final String MESSAGE_DEFAULT_NOT_FOUND_CODE = "404";

    /**
     * MessageEntity资源不存在时默认返回的message
     */
    public static final String MESSAGE_DEFAULT_NOT_FOUND_MESSAGE = "资源不存在";

    /**
     * MessageEntity未登录时默认返回的code
     */
    public static final String MESSAGE_DEFAULT_NOT_LOGIN_CODE = "401";

    /**
     * MessageEntity未登录时默认返回的message
     */
    public static final String MESSAGE_DEFAULT_NOT_LOGIN_MESSAGE = "请先登录";

    /**
     * MessageEntity无权限时默认返回的code
     */
    public static final String MESSAGE_DEFAULT_NO_AUTH_CODE = "403";

    /**
     * MessageEntity无权限时默认返回的message
     */
    public static final String MESSAGE_DEFAULT_NO_AUTH_MESSAGE = "无权访问";

    /**
     * MessageEntity异常时默认返回的code
     */
    public static final String MESSAGE_DEFAULT_SYS_ERROR_CODE = "500";

    /**
     * MessageEntity异常时默认返回的message
     */
    public static final String MESSAGE_DEFAULT_SYS_ERROR_MESSAGE = "系统异常";

    /**
     * MessageEntity服务不可用时默认返回的code
     */
    public static final String MESSAGE_DEFAULT_SERVICE_UNAVAILABLE_CODE = "503";

    /**
     * MessageEntity服务不可用时默认返回的message
     */
    public static final String MESSAGE_DEFAULT_SERVICE_UNAVAILABLE_MESSAGE = "服务维护中";

    /**
     * MessageEntity签名错误时默认返回的code
     */
    public static final String MESSAGE_SIGN_ERROR_CODE = "100x001";

    /**
     * MessageEntity签名错误时默认返回的message
     */
    public static final String MESSAGE_DEFAULT_SIGN_ERROR_MESSAGE = "签名错误";

    /**
     * MessageEntity当前油气站禁用时默认返回的code
     */
    public static final String MESSAGE_CURRENT_STATION_DISABLED_CODE = "100x002";

    /**
     * MessageEntity当前油气站禁用时默认返回的message
     */
    public static final String MESSAGE_DEFAULT_CURRENT_STATION_DISABLED_MESSAGE = "当前油气站不存在或已禁用";

    /**
     * MessageEntity所有关联的油气站禁用时默认返回的code
     */
    public static final String MESSAGE_ALL_STATION_DISABLED_CODE = "100x003";

    /**
     * MessageEntity所有关联的油气站禁用时默认返回的message
     */
    public static final String MESSAGE_DEFAULT_ALL_STATION_DISABLED_MESSAGE = "暂无关联的油气站";

    /**
     * MessageEntity部分操作失败时默认返回的code
     */
    public static final String MESSAGE_DEFAULT_PART_SUCCESS_CODE = "100x004";

    /**
     * MessageEntity部分操作失败时默认返回的message
     */
    public static final String MESSAGE_DEFAULT_PART_SUCCESS_MESSAGE = "仅有部分操作成功";

}
