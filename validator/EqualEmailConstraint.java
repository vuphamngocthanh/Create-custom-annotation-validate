package com.phoneproject.PhoneBackEnd.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = EqualEmailValidator.class)
@Target({ TYPE, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
public @interface EqualEmailConstraint {
    String message() default "notmatch";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}