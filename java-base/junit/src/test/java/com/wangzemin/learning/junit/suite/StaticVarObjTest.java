package com.wangzemin.learning.junit.suite;

import org.junit.jupiter.api.Test;

/**
 * @author WangZemin(i539974)
 */
public class StaticVarObjTest {

    @Test
    public void modifyTo1(){
        System.out.println(StaticVarObj.testVal);
        StaticVarObj.testVal = 1;
    }

    @Test
    public void modifyTo2(){
        System.out.println(StaticVarObj.testVal);
        StaticVarObj.testVal = 2;
    }
}