package com.educore.exception;

import com.educore.dto.response.ApiResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<ApiResponse<Void>> handleStudentNotFound(
            StudentNotFoundException exception) {

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ApiResponse<>(
                        exception.getMessage(),
                        null
                ));
    }

    @ExceptionHandler(CourseNotFoundException.class)
    public ResponseEntity<ApiResponse<Void>> handleCourseNotFound(
            CourseNotFoundException exception) {

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ApiResponse<>(
                        exception.getMessage(),
                        null
                ));
    }

    @ExceptionHandler(ResourceAlreadyExistsException.class)
    public ResponseEntity<ApiResponse<Void>> handleAlreadyExists(
            ResourceAlreadyExistsException exception) {

        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(new ApiResponse<>(
                        exception.getMessage(),
                        null
                ));
    }

    @ExceptionHandler(FileStorageException.class)
    public ResponseEntity<ApiResponse<Void>> handleFileStorage(
            FileStorageException exception) {

        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new ApiResponse<>(
                        exception.getMessage(),
                        null
                ));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<Void>> handleGeneral(
            Exception exception) {

        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new ApiResponse<>(
                        "Internal server error",
                        null
                ));
    }
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiResponse<Map<String, String>>> handleValidation(
            MethodArgumentNotValidException exception) {

        Map<String, String> errors = new HashMap<>();

        exception.getBindingResult()
                .getFieldErrors()
                .forEach(error ->
                        errors.put(
                                error.getField(),
                                error.getDefaultMessage()
                        )
                );

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(new ApiResponse<>(
                        "Validation failed",
                        errors
                ));
    }
}