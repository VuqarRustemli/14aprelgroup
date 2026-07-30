package com.example.ComputerShopping.demo.Exception;

public class ResourcesNotFoundException extends RuntimeException {

    public ResourcesNotFoundException(String message) {
        super(message);
    }
}