package com.wangzemin.learning.junit.suite;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

/**
 * @author WangZemin(i539974)
 */
public class TimoutTest {

    @Test
    @Timeout(1)
    public void modifyTo1() throws InterruptedException {
        System.out.println(StaticVarObj.testVal);
        StaticVarObj.testVal = 1;
        Thread.sleep(10000);
    }
}
