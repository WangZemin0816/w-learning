package com.wangzemin.learning.java.reflect.domain;

import java.util.List;
import java.util.Map;

/**
 * @author Wang Zemin(i539974)
 */
public class ReflectModel {

    private int[][] field1;
    private Integer[][] field2;
    private int field3;
    private Integer field4;
    private ReflectModel[][] field5;
    private List<ReflectModel[]> field6;
    private List<ReflectModel>[] field7;
    private Map<String, ReflectModel> field8;

    private List<? extends ReflectModel> filed9;

    private List<? super ReflectModel> field10;


}
