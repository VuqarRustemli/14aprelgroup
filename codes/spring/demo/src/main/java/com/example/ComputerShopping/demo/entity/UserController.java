package com.example.ComputerShopping.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.example.ComputerShopping.demo.Exception.OurRuntimeException;
import com.example.ComputerShopping.demo.RequestDto.UserRequestDto;
import com.example.ComputerShopping.demo.Service.UserService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        return userService.register(user);
    }
    
    @GetMapping("/getcount")
    public long getUserCount() {
    	return userService.getUserCount();
    }
    
    @PostMapping("/users")
    public User addUser(@Valid @RequestBody UserRequestDto userRequestDto) {
        return userService.addUser(userRequestDto);
    }
    
    @PostMapping(path = "/add")
    public void addUser(@Valid @RequestBody UserRequestDto dto, BindingResult br) throws OurRuntimeException {
    	
    	if(br.hasErrors()) {
    		throw new OurRuntimeException(br);
    	}
    	userService.addUser(dto);
    }
    
    @PostMapping(path = "/validator")
    public String create(@Valid @RequestBody UserRequestDto requestDto) {
        return "Uğurla əlavə olundu";
    }
    
    
    
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }
    
}