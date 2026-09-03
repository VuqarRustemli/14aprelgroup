package com.educore.mapper;

import com.educore.dto.request.StudentCreateRequest;
import com.educore.dto.request.StudentUpdateRequest;
import com.educore.dto.response.StudentResponse;
import com.educore.entity.Student;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class StudentMapper {

    public Student toEntity(StudentCreateRequest request) {

        Student student = new Student();

        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        student.setAge(request.getAge());
        student.setEmail(request.getEmail());

        return student;
    }

    public void updateEntity(
            Student student,
            StudentUpdateRequest request) {

        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        student.setAge(request.getAge());
        student.setEmail(request.getEmail());
    }

    public StudentResponse toResponse(Student student) {

        List<Long> courseIds;

        if (student.getCourses() == null) {
            courseIds = Collections.emptyList();
        } else {
            courseIds = student.getCourses()
                    .stream()
                    .map(course -> course.getId())
                    .toList();
        }

        return StudentResponse.builder()
                .id(student.getId())
                .firstName(student.getFirstName())
                .lastName(student.getLastName())
                .age(student.getAge())
                .email(student.getEmail())
                .courseIds(courseIds)
                .build();
    }
}