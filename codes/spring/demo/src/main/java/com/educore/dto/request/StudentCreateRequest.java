package com.educore.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentCreateRequest {

    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @Min(value = 15, message = "Age must be at least 15")
    @Max(value = 70, message = "Age must be at most 70")
    private Integer age;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;
}