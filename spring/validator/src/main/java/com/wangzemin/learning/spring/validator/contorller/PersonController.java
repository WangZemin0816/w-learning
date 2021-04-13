package com.wangzemin.learning.spring.validator.contorller;

import com.wangzemin.learning.spring.validator.domain.Person;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver;

/**
 * @author Wang Zemin(i539974)
 */
@RestController
public class PersonController {

    @PostMapping("/person")
    public void createPerson(@RequestBody @Validated Person person){
        DefaultHandlerExceptionResolver s;
        // create logic
    }
}

