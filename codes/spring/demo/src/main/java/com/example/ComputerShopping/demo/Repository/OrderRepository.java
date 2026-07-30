package com.example.ComputerShopping.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ComputerShopping.demo.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}