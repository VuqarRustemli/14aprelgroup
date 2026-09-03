package com.educore.controller;

import com.educore.dto.request.CourseCreateRequest;
import com.educore.dto.request.CourseUpdateRequest;
import com.educore.dto.response.ApiResponse;
import com.educore.dto.response.CourseResponse;
import com.educore.dto.response.StudentResponse;
import com.educore.service.CourseService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @PostMapping
    public ResponseEntity<ApiResponse<CourseResponse>> create(
            @Valid @RequestBody CourseCreateRequest request) {

        CourseResponse response = courseService.create(request);

        return ResponseEntity.ok(
                new ApiResponse<>("Course created successfully", response)
        );
    }

    @GetMapping
    public ResponseEntity<ApiResponse<Page<CourseResponse>>> findAll(
            Pageable pageable) {

        Page<CourseResponse> response =
                courseService.findAll(pageable);

        return ResponseEntity.ok(
                new ApiResponse<>("Courses retrieved successfully", response)
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<CourseResponse>> findById(
            @PathVariable Long id) {

        CourseResponse response = courseService.findById(id);

        return ResponseEntity.ok(
                new ApiResponse<>("Course retrieved successfully", response)
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<CourseResponse>> update(
            @PathVariable Long id,
            @Valid @RequestBody CourseUpdateRequest request) {

        CourseResponse response =
                courseService.update(id, request);

        return ResponseEntity.ok(
                new ApiResponse<>("Course updated successfully", response)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> delete(
            @PathVariable Long id) {

        courseService.delete(id);

        return ResponseEntity.ok(
                new ApiResponse<>("Course deleted successfully", null)
        );
    }

    @GetMapping("/search")
    public ResponseEntity<ApiResponse<List<CourseResponse>>> search(
            @RequestParam String name) {

        List<CourseResponse> response =
                courseService.search(name);

        return ResponseEntity.ok(
                new ApiResponse<>("Search completed successfully", response)
        );
    }

    @GetMapping("/{id}/students")
    public ResponseEntity<ApiResponse<List<StudentResponse>>> getStudents(
            @PathVariable Long id) {

        List<StudentResponse> response =
                courseService.getStudents(id);

        return ResponseEntity.ok(
                new ApiResponse<>("Students retrieved successfully", response)
        );
    }
}