package com.example.sys.service.impl;

import com.example.sys.entity.Student;
import com.example.sys.mapper.IStudentMapper;
import com.example.sys.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sys.vo.StudentCourseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YinDehua
 * @since 2023-05-24
 */
@Service
public class StudentServiceImpl extends ServiceImpl<IStudentMapper, Student> implements IStudentService {

    @Autowired
    private IStudentMapper studentMapper;
    @Override
    public List<StudentCourseVo> studentCourseVoList(Integer id) {
        return studentMapper.studentCourseVoList(id);
    }
}
