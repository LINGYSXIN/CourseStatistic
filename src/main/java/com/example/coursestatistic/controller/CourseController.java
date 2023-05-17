package com.example.coursestatistic.controller;

import com.example.coursestatistic.entity.Course;
import com.example.coursestatistic.entity.CourseTable;
import com.example.coursestatistic.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/week/{week}")
    public List<CourseTable> findWholeCourseByWeeks(@PathVariable Integer week) {
        System.out.println("传值week 为"+week);
        List<CourseTable> list= courseService.findWholeCourseByWeeks(week);
        System.out.println("结果list 为"+list);
        return list;
    }


}
