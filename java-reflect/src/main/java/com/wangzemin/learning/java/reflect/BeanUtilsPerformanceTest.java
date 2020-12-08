package com.wangzemin.learning.java.reflect;

import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;

import java.util.UUID;

/**
 * @author Wang Zemin(i539974)
 */
public class BeanUtilsPerformanceTest {

    public static void main(String[] args){
        // 预热虚拟机
        loopBeanUtils(100000);
        loopCopyByHand(100000);

        // 复制1万次的情况
        System.out.println("\nloop 10000 times:");
        loopBeanUtils(10000);
        loopModelMap(10000);
        loopCopyByHand(10000);

        // 复制1百万次的情况
        System.out.println("\nloop 1000000 times:");
        loopBeanUtils(1000000);
        loopModelMap(1000000);
        loopCopyByHand(1000000);

        // 复制1亿次的情况
        System.out.println("\nloop 100000000 times:");
        loopBeanUtils(100000000);
        loopModelMap(100000000);
        loopCopyByHand(100000000);
    }

    private static void loopBeanUtils(int loopTimes){
        TestBeanDemo source = new TestBeanDemo();
        TestBeanDemo target = new TestBeanDemo();
        long start = System.currentTimeMillis();
        for (int i=0;i<loopTimes;i++){
            BeanUtils.copyProperties(source,target);
        }
        System.out.println("BeanUtils cost times:"+String.valueOf(System.currentTimeMillis()-start));
    }

    private static void loopModelMap(int loopTimes){
        TestBeanDemo source = new TestBeanDemo();
        TestBeanDemo target = new TestBeanDemo();
        ModelMapper modelMapper = new ModelMapper();
        long start = System.currentTimeMillis();
        for (int i=0;i<loopTimes;i++){
            modelMapper.map(source,target);
        }
        System.out.println("ModelMap cost times:"+String.valueOf(System.currentTimeMillis()-start));
    }

    private static void loopCopyByHand(int loopTimes){
        TestBeanDemo source = new TestBeanDemo();
        TestBeanDemo target = new TestBeanDemo();
        long start = System.currentTimeMillis();
        for (int i=0;i<loopTimes;i++){
            target.setField1(source.getField1());
            target.setField2(source.getField2());
            target.setField3(source.getField3());
            target.setField4(source.getField4());
            target.setField5(source.getField5());
        }
        System.out.println("Copy field one by one times:"+String.valueOf(System.currentTimeMillis()-start));
    }

    @Data
    private static class TestBeanDemo{
        private String field1 = UUID.randomUUID().toString();
        private String field2 = UUID.randomUUID().toString();
        private String field3 = UUID.randomUUID().toString();
        private String field4 = UUID.randomUUID().toString();
        private String field5 = UUID.randomUUID().toString();

    }
}
