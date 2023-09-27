package com.example.edu.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.edu.entity.Course;
import com.example.edu.service.ICourseService;
import com.example.edu.vo.CourseVo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author YinDehua
 * @since 2023-05-19
 */
@RestController
@RequestMapping("/edu/course")
public class CourseController {

    @Autowired
    private ICourseService courseService;

    @GetMapping("/list")
    public List<Course> list(){
        List<Course> courseList = courseService.list();
        return courseList;
    }

    @GetMapping("/list-course")
    public List<Course> listCourse(){
        List<Course> courseList =courseService.listCourse();
        return courseList;
    }

    @GetMapping("/list-courseVo")
    public List<CourseVo> listCourseVo(Course course){
        List<CourseVo> courseVoList = courseService.listCourseVo(course.getId());
        return courseVoList;
    }

    //添加
    @PostMapping("/save")
    public boolean save (@RequestBody Course course) {
        return courseService.save(course);
    }

    //修改
    @PutMapping("/update")
    public boolean update (@RequestBody Course course) {
        return courseService.updateById(course);
    }

    //删除
    @DeleteMapping("/delete")
    public boolean delete (@RequestParam List<Integer> ids) {
        return courseService.removeByIds(ids);
    }

    //用LambdaQueryWrapper查询课程
    @GetMapping
    public List<Course> find (String courseName) {
        LambdaQueryWrapper<Course> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(StringUtils.isNotEmpty(courseName),Course::getCourseName,courseName);
        queryWrapper.orderByDesc(Course::getUpdateTime);
        List<Course> courseList = courseService.list(queryWrapper);
        return courseList;
    }
}

