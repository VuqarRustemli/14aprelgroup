package com.educore.controller;

import com.educore.dto.request.StudentCreateRequest;
import com.educore.dto.request.StudentUpdateRequest;
import com.educore.dto.response.ApiResponse;
import com.educore.dto.response.CourseResponse;
import com.educore.dto.response.StudentResponse;
import com.educore.service.StudentService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public ResponseEntity<ApiResponse<StudentResponse>> create(
            @Valid @RequestBody StudentCreateRequest request) {

        StudentResponse response = studentService.create(request);

        return ResponseEntity.ok(
                new ApiResponse<>("Student created successfully", response)
        );
    }

    @GetMapping
    public ResponseEntity<ApiResponse<Page<StudentResponse>>> findAll(
            Pageable pageable) {

        Page<StudentResponse> response =
                studentService.findAll(pageable);

        return ResponseEntity.ok(
                new ApiResponse<>("Students retrieved successfully", response)
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<StudentResponse>> findById(
            @PathVariable Long id) {

        StudentResponse response = studentService.findById(id);

        return ResponseEntity.ok(
                new ApiResponse<>("Student retrieved successfully", response)
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<StudentResponse>> update(
            @PathVariable Long id,
            @Valid @RequestBody StudentUpdateRequest request) {

        StudentResponse response =
                studentService.update(id, request);

        return ResponseEntity.ok(
                new ApiResponse<>("Student updated successfully", response)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> delete(
            @PathVariable Long id) {

        studentService.delete(id);

        return ResponseEntity.ok(
                new ApiResponse<>("Student deleted successfully", null)
        );
    }

    @GetMapping("/search")
    public ResponseEntity<ApiResponse<List<StudentResponse>>> search(
            @RequestParam String name) {

        List<StudentResponse> response =
                studentService.search(name);

        return ResponseEntity.ok(
                new ApiResponse<>("Search completed successfully", response)
        );
    }

    @PostMapping("/{studentId}/courses/{courseId}")
    public ResponseEntity<ApiResponse<Void>> assignCourse(
            @PathVariable Long studentId,
            @PathVariable Long courseId) {

        studentService.assignCourse(studentId, courseId);

        return ResponseEntity.ok(
                new ApiResponse<>("Student enrolled in course successfully", null)
        );
    }

    @DeleteMapping("/{studentId}/courses/{courseId}")
    public ResponseEntity<ApiResponse<Void>> removeCourse(
            @PathVariable Long studentId,
            @PathVariable Long courseId) {

        studentService.removeCourse(studentId, courseId);

        return ResponseEntity.ok(
                new ApiResponse<>("Student removed from course successfully", null)
        );
    }

    @GetMapping("/{studentId}/courses")
    public ResponseEntity<ApiResponse<List<CourseResponse>>> getCourses(
            @PathVariable Long studentId) {

        List<CourseResponse> response =
                studentService.getCourses(studentId);

        return ResponseEntity.ok(
                new ApiResponse<>("Courses retrieved successfully", response)
        );
    }
}