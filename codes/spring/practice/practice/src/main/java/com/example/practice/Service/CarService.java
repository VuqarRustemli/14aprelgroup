package com.example.practice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.entity.Car;
import com.example.practice.repository.CarRepository;

@Service
public class CarService {
	@Autowired
	private CarRepository carrepository;
	
	public void addCar(Car car) {
		carrepository.save(car);
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
