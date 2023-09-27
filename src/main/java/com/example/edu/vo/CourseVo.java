package com.example.edu.vo;

import com.example.edu.entity.Course;
import com.example.sys.entity.Teacher;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
@Data
@EqualsAndHashCode(callSuper = true)
public class CourseVo extends Course implements Serializable {
    private static final long serialVersionUID = 1L;

    //private String teacherName;
    private Teacher teacher;


}
