package com.example.practice.Service;

import org.springframework.stereotype.Service;

import com.example.practice.entity.Car;

@Service
public class CarService {

	public Car addCar(Car car) {
		return car;
	}

	public String updateCar(Long id, Car car) {
		return "Car updated successfully!";
	}

	public Long getCarById(Long id) {
		return id;
	}

	public String getAllCars() {
		return "Cars";
	}

	public String deleteCar(Long id) {
		return "Car deleted";
	}
	
}
