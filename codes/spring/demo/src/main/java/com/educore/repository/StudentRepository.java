package com.educore.repository;

import com.educore.entity.Student;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findByEmail(String email);

    boolean existsByEmail(String email);

    List<Student> findByFirstNameContainingIgnoreCase(String firstName);

    List<Student> findByLastNameContainingIgnoreCase(String lastName);

    List<Student> findByAgeGreaterThanEqual(Integer age);


    @Query("""
        SELECT s FROM Student s
        WHERE LOWER(s.firstName) LIKE LOWER(CONCAT('%', :name, '%'))
           OR LOWER(s.lastName) LIKE LOWER(CONCAT('%', :name, '%'))
    """)
    List<Student> searchByName(@Param("name") String name);


    @Query("""
        SELECT s FROM Student s
        WHERE s.age BETWEEN :minAge AND :maxAge
    """)
    List<Student> findByAgeBetween(
            @Param("minAge") Integer minAge,
            @Param("maxAge") Integer maxAge
    );


    @Query("""
        SELECT s FROM Student s
        JOIN s.courses c
        WHERE c.id = :courseId
    """)
    List<Student> findStudentsByCourseId(
            @Param("courseId") Long courseId
    );


    @Query("""
        SELECT s FROM Student s
        WHERE LOWER(s.email) LIKE LOWER(CONCAT('%', :domain, '%'))
    """)
    List<Student> findByEmailDomain(
            @Param("domain") String domain
    );


    @Query("""
        SELECT s FROM Student s
        WHERE SIZE(s.courses) > :count
    """)
    List<Student> findStudentsWithMoreCourses(
            @Param("count") Integer count
    );


    @Query(
        value = "SELECT * FROM students WHERE age >= :age",
        nativeQuery = true
    )
    List<Student> findStudentsOlderThanNative(
            @Param("age") Integer age
    );


    @Query(
        value = "SELECT * FROM students " +
                "WHERE LOWER(first_name) LIKE LOWER(CONCAT('%', :name, '%'))",
        nativeQuery = true
    )
    List<Student> searchByFirstNameNative(
            @Param("name") String name
    );


    @Query(
        value = "SELECT s.* FROM students s " +
                "INNER JOIN student_courses sc " +
                "ON s.id = sc.student_id " +
                "WHERE sc.course_id = :courseId",
        nativeQuery = true
    )
    List<Student> findStudentsByCourseNative(
            @Param("courseId") Long courseId
    );


    Page<Student> findAll(Pageable pageable);
}