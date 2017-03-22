package com.wetan.api.util;


import org.slf4j.Logger;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;

/**
 * Created by cosx on 2015/10/7.
 */
public class RequestUtil {
    /**
     * 获取post body
     */
    public static String getPostBody(HttpServletRequest request) {
        StringBuilder jb = new StringBuilder();
        String line;
        try {
            BufferedReader reader = request.getReader();
            while ((line = reader.readLine()) != null) {
                jb.append(line);
            }
        } catch (Exception ignore) {
        }

        String postData = jb.toString();
        String path = request.getRequestURI();
        return postData;
    }

    public static String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("X-Real-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }

        return ip;
    }

    public static String getDefaultStr(HttpServletRequest request, String par, String defaultStr) {
        String parStr = request.getParameter(par);
        if (parStr == null) {
            return defaultStr;
        }
        return parStr;
    }

    public static int getDefaultInt(HttpServletRequest request, String par, int defaultInt) {
        String parStr = request.getParameter(par);
        if (parStr == null) {
            return defaultInt;
        }
        try {
            int parInt = Integer.parseInt(parStr);
            return parInt;
        }catch (Exception e) {
            return defaultInt;
        }
    }
}
