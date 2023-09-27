package com.example.sys.vo;

import com.example.edu.entity.Course;
import com.example.sys.entity.Student;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@Data
@EqualsAndHashCode(callSuper = true)
public class StudentCourseVo extends Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<Course> courseList;

    public List<Course> getCourseList() {
        if (courseList==null){
            courseList=new ArrayList<>();
        }
        return courseList;
    }
}
