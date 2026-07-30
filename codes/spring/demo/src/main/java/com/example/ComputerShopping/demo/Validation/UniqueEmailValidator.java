package com.example.ComputerShopping.demo.Validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.ComputerShopping.demo.Repository.UserRepository;

public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {

        if (email == null || email.isBlank()) {
            return true;
        }

        return !userRepository.existsByEmail(email);
    }
}