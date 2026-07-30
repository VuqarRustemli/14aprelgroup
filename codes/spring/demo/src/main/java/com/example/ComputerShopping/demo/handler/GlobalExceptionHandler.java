package com.example.ComputerShopping.demo.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.ComputerShopping.demo.Exception.OurRuntimeException;
import com.example.ComputerShopping.demo.Exception.ResourcesNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler
	public String handle(OurRuntimeException exc) {
		return exc.getB().getFieldErrors().get(0).getDefaultMessage();
	}
	
	
    @ExceptionHandler(ResourcesNotFoundException.class)
    public ResponseEntity<?> handleResourcesNotFoundException(ResourcesNotFoundException exc) {
    	return ResponseEntity.status(404).body(exc.getMessage());
    }
	
}