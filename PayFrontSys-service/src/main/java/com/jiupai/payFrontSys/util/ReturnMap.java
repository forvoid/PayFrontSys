package com.jiupai.payFrontSys.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by forvoid on 7/19/2017.
 */
public class ReturnMap {

    public static Map<String, Object> getMap(int code, String message,int size, Object o,int pageNow) {
        Map<String, Object> returnMap = new HashMap<String, Object>();
        returnMap.put("code", code);
        returnMap.put("message", message);
        returnMap.put("size", size);
        returnMap.put("pageNow",pageNow);
        returnMap.put("data", o);
        int rows =10;
        returnMap.put("rows",rows);
        int countPage = ((size % rows)==0? (size / rows):((size /rows)+1));
        returnMap.put("countPage",countPage);
        return returnMap;
    }


    public static Map<String, Object> getMap(int code, String message, Object o) {
        Map<String, Object> returnMap = new HashMap<String, Object>();
        returnMap.put("code", code);
        returnMap.put("message", message);
        returnMap.put("data", o);
        return returnMap;
    }

    public static Map<String, Object> getMap(int code, String message) {
        Map<String, Object> returnMap = new HashMap<String, Object>();
        returnMap.put("code", code);
        returnMap.put("message", message);
        return returnMap;
    }
}
