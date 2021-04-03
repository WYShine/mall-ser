//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.wysh1ne.algorithm.common;

import com.fasterxml.jackson.databind.DeserializationFeature;

import java.io.IOException;

import com.sun.xml.internal.rngom.ast.builder.Include;
import com.sun.xml.internal.ws.developer.SerializationFeature;
import com.sun.xml.internal.ws.encoding.soap.SerializationException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class JsonUtils {
    private static org.codehaus.jackson.map.ObjectMapper mapper = new ObjectMapper();

    public JsonUtils() {
    }

    public static String toJson(Object object) throws SerializationException {
        try {
            return mapper.writeValueAsString(object);
        } catch (IOException var2) {
            throw new SerializationException(var2);
        }
    }

    public static <T> T fromJson(String jsonString, Class<T> clazz) throws SerializationException {
        if (jsonString != null && !"".equals(jsonString.trim())) {
            try {
                return mapper.readValue(jsonString, clazz);
            } catch (IOException var3) {
                throw new SerializationException("failed to deserialize json: " + jsonString, var3);
            }
        } else {
            return null;
        }
    }

    public static <T> T fromJson(String jsonString, TypeReference<T> typeReference) throws SerializationException {
        if (jsonString != null && !"".equals(jsonString.trim())) {
            try {
                return mapper.readValue(jsonString, typeReference);
            } catch (IOException var3) {
                throw new SerializationException("failed to deserialize json: " + jsonString, var3);
            }
        } else {
            return null;
        }
    }
}
