package com.phoneproject.PhoneBackEnd.validator;


import com.phoneproject.PhoneCommon.entity.User;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EqualPasswordValidator implements ConstraintValidator<EqualPasswordConstraint, User> {

    @Override
    public void initialize(EqualPasswordConstraint equalPasswordConstraint) {
        ConstraintValidator.super.initialize(equalPasswordConstraint);
    }

    @Override
    public boolean isValid(User user, ConstraintValidatorContext context) {
        String password = user.getPassword();
        String confirmPassword = user.getConfirmPassword();
        if(!password.equals(confirmPassword)){
            return false;
        }
        return true;
    }
}