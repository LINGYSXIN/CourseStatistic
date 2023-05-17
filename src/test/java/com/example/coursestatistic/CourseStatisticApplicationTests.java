package com.example.coursestatistic;

import com.example.coursestatistic.entity.Course;
import com.example.coursestatistic.entity.CourseTable;
import com.example.coursestatistic.mapper.CourseMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class CourseStatisticApplicationTests {
    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private DataSource dataSource;

    /**
     * 测试链接数据库是否成功
     * @throws SQLException
     */
    @Test
    void dataSource() throws SQLException{
        System.out.println(dataSource.getConnection());
    }

    @Test
    void getAllCourse(){
        List<Course> list = courseMapper.getAllCourse();
        System.out.println(list);
    }

    @Test
    void getDayCourse(){
        List<Course> list = courseMapper.getDayCourse();
        System.out.println(list);
    }

    @Test
    void findWholeCourseByWeeks(){
        List<CourseTable> list=courseMapper.findWholeCourseByWeeks(1);
        System.out.println(list);
    }


    @Test
    void contextLoads() {
    }



}
