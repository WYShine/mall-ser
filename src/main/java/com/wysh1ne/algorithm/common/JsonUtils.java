//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.wysh1ne.algorithm.common;

import com.google.gson.Gson;
import com.sun.xml.internal.ws.encoding.soap.SerializationException;

public class JsonUtils {
    private static Gson gson = new Gson();
    public JsonUtils() {
    }

    public static String toJson(Object object) throws SerializationException {
            return gson.toJson(object);

    }

    public static <T> T fromJson(String jsonString, Class<T> clazz) throws SerializationException {
        return gson.fromJson(jsonString, clazz);
    }

    public static void main(String[] args) {
        System.out.println(toJson(null));
    }
}
