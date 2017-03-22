package com.wetan.api.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.wetan.api.constant.StatusConst;

import javax.ws.rs.core.Response;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/**
 * 返回信息工具类
 * Created by CosWind on 2015/7/18.
 */
public class ResponseUtil {

    private final static String STATUS = "code";
    private final static String MESSAGE = "message";
    private final static String RESULT = "data";

    public static String returnSuccess() {
        return returnJson(null);
    }

    public static String returnBusException(String message) {
        return returnJson(StatusConst.BUS_EXCEPTION, message, null);
    }

    public static String returnException() {
        return returnJson(StatusConst.SERVER_EXCEPTION, "服务器繁忙", null);
    }

    public static String returnJson(Object json) {
        return returnJson(StatusConst.OK, "success", json);
    }

    public static String returnJson(String status, String message) {
        return returnJson(status, message, null);
    }

    public static String returnJsonWithStatus(String status) {
        return returnJson(status, StatusConst.getTip(status));
    }

    public static String returnJson(String status, String message, Object json) {
        JSONObject returnJson = new JSONObject();
        returnJson.put(STATUS, status);
        returnJson.put(MESSAGE, message);
        returnJson.put(RESULT, json);
        return JSON.toJSONString(returnJson, SerializerFeature.DisableCircularReferenceDetect);
    }

    public static Response downLoadExcel(String fileName, ByteArrayOutputStream outputStream) throws UnsupportedEncodingException {
        Response.ResponseBuilder responseBuilder = Response.ok(outputStream.toByteArray());

        fileName += ".xls";
        // 2.1、设置报文头
        responseBuilder.header("Content-Type", "application/vnd.ms-excel");
        responseBuilder.header("Content-Disposition", "attachment; filename=" + new String(fileName.getBytes("GBK"), "ISO-8859-1"));

        return responseBuilder.build();
    }

}
