package com.educore.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class CourseResponse {

    private Long id;
    private String name;
    private String teacherName;
    private Integer credit;
    private List<Long> studentIds;
}