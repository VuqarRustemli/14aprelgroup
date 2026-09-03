package com.educore.service;

import com.educore.dto.request.CourseCreateRequest;
import com.educore.dto.request.CourseUpdateRequest;
import com.educore.dto.response.CourseResponse;
import com.educore.dto.response.StudentResponse;
import com.educore.entity.Course;
import com.educore.entity.Student;
import com.educore.exception.CourseNotFoundException;
import com.educore.exception.ResourceAlreadyExistsException;
import com.educore.mapper.CourseMapper;
import com.educore.repository.CourseRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;
    private final CourseMapper courseMapper;

    public CourseResponse create(CourseCreateRequest request) {

        if (courseRepository.existsByNameIgnoreCase(request.getName())) {
            throw new ResourceAlreadyExistsException(
                    "Course with this name already exists"
            );
        }

        Course course = courseMapper.toEntity(request);

        Course savedCourse = courseRepository.save(course);

        return courseMapper.toResponse(savedCourse);
    }

    public Page<CourseResponse> findAll(Pageable pageable) {

        return courseRepository.findAll(pageable)
                .map(courseMapper::toResponse);
    }

    public CourseResponse findById(Long id) {

        Course course = courseRepository.findById(id)
                .orElseThrow(() ->
                        new CourseNotFoundException(
                                "Course not found with id: " + id
                        ));

        return courseMapper.toResponse(course);
    }

    public CourseResponse update(
            Long id,
            CourseUpdateRequest request) {

        Course course = courseRepository.findById(id)
                .orElseThrow(() ->
                        new CourseNotFoundException(
                                "Course not found with id: " + id
                        ));

        if (!course.getName().equalsIgnoreCase(request.getName())
                && courseRepository.existsByNameIgnoreCase(
                        request.getName())) {

            throw new ResourceAlreadyExistsException(
                    "Course with this name already exists"
            );
        }

        courseMapper.updateEntity(course, request);

        Course updatedCourse = courseRepository.save(course);

        return courseMapper.toResponse(updatedCourse);
    }

    public void delete(Long id) {

        Course course = courseRepository.findById(id)
                .orElseThrow(() ->
                        new CourseNotFoundException(
                                "Course not found with id: " + id
                        ));

        courseRepository.delete(course);
    }

    public List<CourseResponse> search(String name) {

        return courseRepository.searchByName(name)
                .stream()
                .map(courseMapper::toResponse)
                .toList();
    }

    public List<StudentResponse> getStudents(Long courseId) {

        Course course = courseRepository.findById(courseId)
                .orElseThrow(() ->
                        new CourseNotFoundException(
                                "Course not found with id: " + courseId
                        ));

        return course.getStudents()
                .stream()
                .map(this::toStudentResponse)
                .toList();
    }

    private StudentResponse toStudentResponse(Student student) {

        List<Long> courseIds = student.getCourses()
                .stream()
                .map(Course::getId)
                .toList();

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