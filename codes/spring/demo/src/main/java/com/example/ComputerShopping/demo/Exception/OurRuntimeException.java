package com.example.ComputerShopping.demo.Exception;

import org.springframework.validation.BindingResult;

public class OurRuntimeException extends RuntimeException{
	private BindingResult b;

	public BindingResult getB() {
		return b;
	}

	public OurRuntimeException(BindingResult br) {
		super();
		this.b = br;
	}
}