package com.example.sys.mapper;

import com.example.sys.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sys.vo.StudentCourseVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author YinDehua
 * @since 2023-05-24
 */
@Mapper
public interface IStudentMapper extends BaseMapper<Student> {

    List<StudentCourseVo> studentCourseVoList(Integer id);

}
