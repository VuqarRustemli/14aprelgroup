package com.example.ComputerShopping.demo.Exception;

import java.util.List; 

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.ComputerShopping.demo.ResponseDto.ExceptionResponse;
import com.example.ComputerShopping.demo.ResponseDto.ValidationResponse;

@RestControllerAdvice
public class ValidationException {

    @ExceptionHandler(OurRuntimeException.class)
    public ResponseEntity<ExceptionResponse> handle(OurRuntimeException ex) {

        List<ValidationResponse> validations = ex.getB()
                .getFieldErrors()
                .stream()
                .map(error -> new ValidationResponse(
                        error.getField(),
                        error.getDefaultMessage()
                ))
                .toList();

        ExceptionResponse response = new ExceptionResponse(
                ex.getMessage(),
                validations
        );

        return ResponseEntity.badRequest().body(response);
    }
}