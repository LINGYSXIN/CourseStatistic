package com.example.coursestatistic.service.Impl;

import com.example.coursestatistic.entity.Course;
import com.example.coursestatistic.entity.CourseTable;
import com.example.coursestatistic.mapper.CourseMapper;
import com.example.coursestatistic.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<CourseTable> findWholeCourseByWeeks(Integer week) {
        List<CourseTable> list=courseMapper.findWholeCourseByWeeks(week);
        return list;
    }

}
