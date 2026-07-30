package com.example.ComputerShopping.demo.RequestDto;

import com.example.ComputerShopping.demo.Validation.UniqueEmail;
import com.example.ComputerShopping.demo.Validation.ValidEmail;

import jakarta.validation.constraints.Email; 
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDto {

    @NotBlank(message = "Username boş ola bilməz")
    @Size(min = 3, max = 20, message = "Username 3-20 simvol arasında olmalıdır")
    private String username;

    @NotBlank(message = "Email boş ola bilməz")
    @Email(message = "Düzgün email daxil edin")
    @ValidEmail
    @UniqueEmail
    private String email;

    @NotNull(message = "Age boş ola bilməz")
    private Integer age;

    @NotBlank(message = "Password boş ola bilməz")
    @Size(min = 8, message = "Password minimum 8 simvol olmalıdır")
    private String password;
   
}