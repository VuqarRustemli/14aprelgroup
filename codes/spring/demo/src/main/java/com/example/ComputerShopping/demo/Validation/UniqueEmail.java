package com.example.ComputerShopping.demo.Validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueEmailValidator.class)
public @interface UniqueEmail {

    String message() default "Bu email artiq istifade olunur.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}