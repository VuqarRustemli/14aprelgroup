package com.educore.repository;

import com.educore.entity.Course;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByNameContainingIgnoreCase(String name);

    List<Course> findByTeacherNameContainingIgnoreCase(String teacherName);

    List<Course> findByCreditGreaterThanEqual(Integer credit);

    List<Course> findByCreditLessThanEqual(Integer credit);

    boolean existsByNameIgnoreCase(String name);


    @Query("""
        SELECT c FROM Course c
        WHERE LOWER(c.name) LIKE LOWER(CONCAT('%', :name, '%'))
    """)
    List<Course> searchByName(@Param("name") String name);


    @Query("""
        SELECT c FROM Course c
        JOIN c.students s
        WHERE s.id = :studentId
    """)
    List<Course> findCoursesByStudentId(
            @Param("studentId") Long studentId
    );


    @Query("""
        SELECT c FROM Course c
        WHERE c.credit BETWEEN :minCredit AND :maxCredit
    """)
    List<Course> findByCreditBetween(
            @Param("minCredit") Integer minCredit,
            @Param("maxCredit") Integer maxCredit
    );


    @Query("""
        SELECT c FROM Course c
        WHERE SIZE(c.students) > :count
    """)
    List<Course> findPopularCourses(
            @Param("count") Integer count
    );


    @Query("""
        SELECT c FROM Course c
        WHERE LOWER(c.teacherName) LIKE LOWER(CONCAT('%', :teacher, '%'))
    """)
    List<Course> findByTeacher(
            @Param("teacher") String teacher
    );



    @Query(
        value = "SELECT * FROM courses WHERE credit >= :credit",
        nativeQuery = true
    )
    List<Course> findCoursesByCreditNative(
            @Param("credit") Integer credit
    );


    @Query(
        value = "SELECT * FROM courses " +
                "WHERE LOWER(name) LIKE LOWER(CONCAT('%', :name, '%'))",
        nativeQuery = true
    )
    List<Course> searchByNameNative(
            @Param("name") String name
    );


    @Query(
        value = "SELECT c.* FROM courses c " +
                "INNER JOIN student_courses sc " +
                "ON c.id = sc.course_id " +
                "WHERE sc.student_id = :studentId",
        nativeQuery = true
    )
    List<Course> findCoursesByStudentNative(
            @Param("studentId") Long studentId
    );

    Page<Course> findAll(Pageable pageable);
}