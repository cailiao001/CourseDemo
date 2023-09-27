package com.example.edu.service.impl;

import com.example.edu.entity.Course;
import com.example.edu.mapper.ICourseMapper;
import com.example.edu.service.ICourseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.edu.vo.CourseVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YinDehua
 * @since 2023-05-19
 */
@Service
public class CourseServiceImpl extends ServiceImpl<ICourseMapper, Course> implements ICourseService {

    @Override
    public List<Course> listCourse() {
        return baseMapper.listCourse();
    }

    @Override
    public List<CourseVo> listCourseVo(Integer id) {
        return baseMapper.listCourseVo(id);
    }
}
