package com.wangzemin.learning.spring.validator.processor;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * @author Wang Zemin(i539974)
 */
@Component
public class ValidatorPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Validator){
            LocalValidatorFactoryBean b;
            int a = 0;
        }
        return bean;
    }
}
