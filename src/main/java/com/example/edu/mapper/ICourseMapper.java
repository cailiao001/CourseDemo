package com.example.edu.mapper;

import com.example.edu.entity.Course;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.edu.vo.CourseVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author YinDehua
 * @since 2023-05-19
 */
@Mapper
public interface ICourseMapper extends BaseMapper<Course> {

    List<Course> listCourse();

    List<CourseVo> listCourseVo(Integer id);

}
