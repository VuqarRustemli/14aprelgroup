package com.example.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.practice.Service.CarService;
import com.example.practice.entity.Car;

@Controller
@RequestMapping
@CrossOrigin
public class CarController {
	@Autowired
	private CarService carservice;
	
    @GetMapping("/cars")
    public String CarPage() {
		return "Car";
    }
    
    
    @PostMapping
    public Car addCar(@RequestBody Car car) {
        return carservice.addCar(car);
    }

    @GetMapping
    public String getAllCars() {
        return carservice.getAllCars();
    }

    @GetMapping("/{id}")
    public Long getCarById(@PathVariable Long id) {
        return carservice.getCarById(id);
    }

    @PutMapping("/{id}")
    public String updateCar(@PathVariable Long id,
                                   @RequestBody Car car) {
        return carservice.updateCar(id, car);
    }

    @DeleteMapping("/{id}")
    public String deleteCar(@PathVariable Long id) {
        carservice.deleteCar(id);
        return "Car deleted successfully";
    }
}
