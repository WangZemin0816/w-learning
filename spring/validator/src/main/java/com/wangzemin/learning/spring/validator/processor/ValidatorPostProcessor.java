package com.wangzemin.learning.spring.validator.processor;

import lombok.extern.apachecommons.CommonsLog;
import org.hibernate.validator.internal.engine.ValidatorImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.validation.ConstraintValidatorFactory;
import javax.validation.ValidatorFactory;

/**
 * @author Wang Zemin(i539974)
 */
@Component
public class ValidatorPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Validator){
//            LocalValidatorFctoryBean b;
//            ConstraintValidatorFactory f;
            ValidatorFactory validatorFactory;
            ValidatorImpl impl;
            int a = 0;
        }
        return bean;
    }
}
