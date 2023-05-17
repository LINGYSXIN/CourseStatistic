package com.example.coursestatistic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course {
    private Integer courseId;
    private Integer studentId;
    private String courseName;
    private String teacherName;
    private String classroom;
    private String weeks;
    private String weekday;
    private String timeSlot;
    private Integer timeSlot_Start;
    private Integer timeSlot_End;
    private Integer weeks_Start;
    private Integer weeks_End;
}
