package com.example.edu.service;

import com.example.edu.entity.Course;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.edu.vo.CourseVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author YinDehua
 * @since 2023-05-19
 */
public interface ICourseService extends IService<Course> {


    List<Course> listCourse();

    List<CourseVo> listCourseVo(Integer id);

}
