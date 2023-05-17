package com.example.coursestatistic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CourseTable {
    private String weeks;
    private String day;
    private Integer slot_1;
    private Integer slot_2;
    private Integer slot_3;
    private Integer slot_4;
    private Integer slot_5;
    private Integer slot_6;
    private Integer slot_7;
    private Integer slot_8;
    private Integer slot_9;
    private Integer slot_10;
    private Integer slot_11;
}
