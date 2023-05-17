package com.example.coursestatistic.mapper;

import com.example.coursestatistic.entity.Course;
import com.example.coursestatistic.entity.CourseTable;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.relational.core.sql.In;

import java.util.List;

@Mapper
public interface CourseMapper {
    /**
     * 查询所有课程
     * @return
     */
    List<Course> getAllCourse();

    /**
     * 查询星期一第一节课的有空人数
     * @return
     */
    List<Course> getDayCourse();


    /**
     * 查询某星期的所有时间段的有课情况
     * @param week
     * @return
     */
    List<CourseTable> findWholeCourseByWeeks(Integer week);
}
