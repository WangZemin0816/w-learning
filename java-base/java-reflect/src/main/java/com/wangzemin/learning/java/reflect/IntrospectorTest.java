package com.wangzemin.learning.java.reflect;

import com.wangzemin.learning.java.reflect.domain.JavaBeanDemo;
import org.junit.Test;

import java.beans.*;

import static org.junit.Assert.assertNotNull;

/**
 * @author Wang Zemin(i539974)
 */
public class IntrospectorTest {

    @Test
    public void testGetBeanInfo() throws IntrospectionException {
        // 获取整个Bean的信息
        // BeanInfo beanInfo= Introspector.getBeanInfo(user.getClass());
        // 在Object类时候停止检索，可以选择在任意一个父类停止
        BeanInfo beanInfo = Introspector.getBeanInfo(JavaBeanDemo.class,Object.class);

        System.out.println("所有属性描述：");
        // 获取所有的属性描述
        PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor propertyDescriptor : pds) {
            System.out.println(propertyDescriptor.getName());
        }
        System.out.println("所有方法描述：");
        for (MethodDescriptor methodDescriptor : beanInfo.getMethodDescriptors()) {
            System.out.println(methodDescriptor.getName());
            // Method method = methodDescriptor.getMethod();
        }
    }

}
