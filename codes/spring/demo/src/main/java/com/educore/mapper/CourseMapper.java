package com.educore.mapper;

import com.educore.dto.request.CourseCreateRequest;
import com.educore.dto.request.CourseUpdateRequest;
import com.educore.dto.response.CourseResponse;
import com.educore.entity.Course;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class CourseMapper {

    public Course toEntity(CourseCreateRequest request) {

        Course course = new Course();

        course.setName(request.getName());
        course.setTeacherName(request.getTeacherName());
        course.setCredit(request.getCredit());

        return course;
    }

    public void updateEntity(
            Course course,
            CourseUpdateRequest request) {

        course.setName(request.getName());
        course.setTeacherName(request.getTeacherName());
        course.setCredit(request.getCredit());
    }

    public CourseResponse toResponse(Course course) {

        List<Long> studentIds;

        if (course.getStudents() == null) {
            studentIds = Collections.emptyList();
        } else {
            studentIds = course.getStudents()
                    .stream()
                    .map(student -> student.getId())
                    .toList();
        }

        return CourseResponse.builder()
                .id(course.getId())
                .name(course.getName())
                .teacherName(course.getTeacherName())
                .credit(course.getCredit())
                .studentIds(studentIds)
                .build();
    }
}