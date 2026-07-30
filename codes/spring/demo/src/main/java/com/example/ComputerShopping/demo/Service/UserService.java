package com.example.ComputerShopping.demo.Service;

import java.util.Optional; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ComputerShopping.demo.Exception.ResourcesNotFoundException;
import com.example.ComputerShopping.demo.Repository.UserRepository;
import com.example.ComputerShopping.demo.RequestDto.UserRequestDto;
import com.example.ComputerShopping.demo.entity.Order;
import com.example.ComputerShopping.demo.entity.User;

import jakarta.validation.Valid;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String register(User user) {

        if (userRepository.existsByUsername(user.getFirstName()).isPresent()) {
            return "Username artıq mövcuddur!";
        }

         userRepository.save(user);
         return "Qeydiyyat ugurla basa catdi!";
    }

    public long getUserCount() {
        return userRepository.countAllUsers();
    }
    
    
  

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(com.example.ComputerShopping.demo.entity.User user) {

        Optional<com.example.ComputerShopping.demo.entity.User> userByUsername = userRepository.findByUsername(user.getFirstName());

        if (userByUsername.isPresent()) {
            throw new RuntimeException("User already exists!");
        }

        if (user.getOrders() != null) {
            for (Order order : user.getOrders()) {
                order.setUser(user);
            }
        }

        userRepository.save(user);
    }

    public void deleteUser(com.example.ComputerShopping.demo.entity.User user) {
        userRepository.delete(user);
    }

    public User addUser(UserRequestDto dto) {

        User user = new User();
        user.setFirstName(dto.getUsername());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());

        return userRepository.save(user);
    }
    
    
    public User getUserById(Long id) {
        Optional<User> byId = userRepository.findById(id);
        
        if(byId.isPresent()) {
        	User user = byId.get();
        	return user;
        }else {
        	throw new ResourcesNotFoundException("id not found");
        }
    }
}