package com.myproj.first.validator;

import com.myproj.first.model.User;
import com.myproj.first.servis.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by Evgeny on 21.07.2017.
 */
@Component
public class UserValidator implements Validator {
    @Autowired
    private Userservice userservice;

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        User user = (User) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"username","Requied");
    }
}
