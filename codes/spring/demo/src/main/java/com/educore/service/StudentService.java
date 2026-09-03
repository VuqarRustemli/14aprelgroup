package com.educore.service;

import com.educore.dto.request.StudentCreateRequest; 
import com.educore.dto.request.StudentUpdateRequest;
import com.educore.dto.response.StudentResponse;
import com.educore.entity.Student;
import com.educore.exception.StudentNotFoundException;
import com.educore.mapper.StudentMapper;
import com.educore.repository.StudentRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.educore.dto.response.CourseResponse;
import com.educore.entity.Course;
import com.educore.repository.CourseRepository;

import java.util.List;

import com.educore.exception.CourseNotFoundException;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;
    private final CourseRepository courseRepository;

    public StudentResponse create(StudentCreateRequest request) {

        if (studentRepository.existsByEmail(request.getEmail())) {
            throw new RuntimeException("Student with this email already exists");
        }

        Student student = studentMapper.toEntity(request);

        Student savedStudent = studentRepository.save(student);

        return studentMapper.toResponse(savedStudent);
    }

    public Page<StudentResponse> findAll(Pageable pageable) {

        return studentRepository.findAll(pageable)
                .map(studentMapper::toResponse);
    }

    public StudentResponse findById(Long id) {

        Student student = studentRepository.findById(id)
                .orElseThrow(() ->
                        new StudentNotFoundException(
                                "Student not found with id: " + id
                        ));

        return studentMapper.toResponse(student);
    }
    
    
    public StudentResponse update(Long id, StudentUpdateRequest request) {

        Student student = studentRepository.findById(id)
                .orElseThrow(() ->
                        new StudentNotFoundException(
                                "Student not found with id: " + id
                        ));

        if (!student.getEmail().equalsIgnoreCase(request.getEmail())
                && studentRepository.existsByEmail(request.getEmail())) {

            throw new RuntimeException(
                    "Student with this email already exists"
            );
        }

        studentMapper.updateEntity(student, request);

        Student updatedStudent = studentRepository.save(student);

        return studentMapper.toResponse(updatedStudent);
    }


    public void delete(Long id) {

        Student student = studentRepository.findById(id)
                .orElseThrow(() ->
                        new StudentNotFoundException(
                                "Student not found with id: " + id
                        ));

        studentRepository.delete(student);
    }
    
    
    public List<StudentResponse> search(String name) {

        return studentRepository.searchByName(name)
                .stream()
                .map(studentMapper::toResponse)
                .toList();
    }
    
    
    public void assignCourse(Long studentId, Long courseId) {

        Student student = studentRepository.findById(studentId)
                .orElseThrow(() ->
                        new StudentNotFoundException(
                                "Student not found with id: " + studentId
                        ));

        Course course = courseRepository.findById(courseId)
                .orElseThrow(() ->
                throw new CourseNotFoundException(
                        "Course not found with id: " + courseId
                );

        if (student.getCourses().contains(course)) {
            throw new RuntimeException(
                    "Student is already enrolled in this course"
            );
        }

        student.getCourses().add(course);

        studentRepository.save(student);
    }
    
    
    public void removeCourse(Long studentId, Long courseId) {

        Student student = studentRepository.findById(studentId)
                .orElseThrow(() ->
                        new StudentNotFoundException(
                                "Student not found with id: " + studentId
                        ));

        Course course = courseRepository.findById(courseId)
                .orElseThrow(() ->
                throw new CourseNotFoundException(
                        "Course not found with id: " + courseId
                );

        student.getCourses().remove(course);

        studentRepository.save(student);
    }
    
    
    public List<CourseResponse> getCourses(Long studentId) {

        Student student = studentRepository.findById(studentId)
                .orElseThrow(() ->
                        new StudentNotFoundException(
                                "Student not found with id: " + studentId
                        ));

        return student.getCourses()
                .stream()
                .map(course -> CourseResponse.builder()
                        .id(course.getId())
                        .name(course.getName())
                        .teacherName(course.getTeacherName())
                        .credit(course.getCredit())
                        .studentIds(
                                course.getStudents()
                                        .stream()
                                        .map(Student::getId)
                                        .toList()
                        )
                        .build())
                .toList();
    }
}