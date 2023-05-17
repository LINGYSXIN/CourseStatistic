package com.example.coursestatistic.service;

import com.example.coursestatistic.entity.Course;
import com.example.coursestatistic.entity.CourseTable;

import java.util.List;

public interface CourseService {
    /**
     * 查询某星期的所有时间段的有课情况
     * @param week
     * @return
     */
    List<CourseTable> findWholeCourseByWeeks(Integer week);
}
