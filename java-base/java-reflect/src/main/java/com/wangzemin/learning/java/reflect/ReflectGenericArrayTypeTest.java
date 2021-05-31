package com.wangzemin.learning.java.reflect;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * @author Wang Zemin(i539974)
 */
public class ReflectGenericArrayTypeTest {
    public static class TestGenericArrayType {
        private Object[][] field;
    }

    @Test
    public void testIntType() throws NoSuchFieldException {
        Class<?> clazz =  TestGenericArrayType.class;
        Field field = clazz.getDeclaredField("field");

        // 此处获取到字段的实际Class类型
        Class<?> clazzType = field.getType();
        System.out.println("Field type: " + clazzType.getName());

        // 此处获取到字段的泛型类型
        Type genericType = field.getGenericType();
        ParameterizedType impl;
        System.out.println("Field generic type: " + field.getGenericType().getTypeName());
    }
}
