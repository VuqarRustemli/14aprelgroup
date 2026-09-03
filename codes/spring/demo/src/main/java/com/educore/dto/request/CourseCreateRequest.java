package com.educore.dto.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseCreateRequest {

    @NotBlank(message = "Course name is required")
    private String name;

    @NotBlank(message = "Teacher name is required")
    private String teacherName;

    @Min(value = 1, message = "Credit must be at least 1")
    @Max(value = 10, message = "Credit must be at most 10")
    private Integer credit;
}