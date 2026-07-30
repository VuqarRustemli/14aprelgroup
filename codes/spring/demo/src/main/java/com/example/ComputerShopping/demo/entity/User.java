package com.example.ComputerShopping.demo.entity;

import java.util.List;   
import jakarta.persistence.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Computer> computers;
    
    
  

    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Order> orders;

 
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Order> orders1;
    
}