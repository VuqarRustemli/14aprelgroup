package com.example.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practice.entity.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
	
}
