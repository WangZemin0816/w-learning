package com.wangzemin.learning.spring.validator.domain;

import lombok.Data;

import javax.validation.constraints.*;

/**
 * @author Wang Zemin(i539974)
 */

@Data
public class Person {

    @NotEmpty
    @Size(max=64)
    private String name;

    @Min(0)
    @Max(200)
    private int age;
}