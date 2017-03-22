package com.wetan.api.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dhu on 2016/4/26.
 */
public class PageUtil {
    public static Map<String, Object> pageUtile(Object list, int count) {
        Map<String, Object> map = new HashMap<>();
        map.put("list", list);
        map.put("total", count);
        return map;
    }
}
