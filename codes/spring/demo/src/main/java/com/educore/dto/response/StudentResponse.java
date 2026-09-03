package com.educore.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class StudentResponse {

    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String email;
    private List<Long> courseIds;
}