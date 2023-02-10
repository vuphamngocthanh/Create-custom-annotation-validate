package com.phoneproject.PhoneBackEnd.validator;


import com.phoneproject.PhoneBackEnd.user.UserRepository;
import com.phoneproject.PhoneCommon.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EqualEmailValidator implements ConstraintValidator<EqualEmailConstraint, String> {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void initialize(EqualEmailConstraint equalEmailConstraint) {
        ConstraintValidator.super.initialize(equalEmailConstraint);
    }
    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        if(userRepository.findEmail(email) != null){
            return false;
        }
        return true;
    }
}