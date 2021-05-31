package com.wangzemin.learning.java.reflect.domain;

/**
 * @author Wang Zemin(i539974)
 */
public class JavaBeanDemo {
    //这些是字段！！不是javabean的属性
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAbc() {
        return null;
    }
    public String getAbc(int i) {
        return null;
    }

    public void test(int a,int b,int c,int d){

    }
}
