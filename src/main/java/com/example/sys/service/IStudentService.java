package com.example.sys.service;

import com.example.sys.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.sys.vo.StudentCourseVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author YinDehua
 * @since 2023-05-24
 */
public interface IStudentService extends IService<Student> {

    List<StudentCourseVo> studentCourseVoList(Integer id);

}
