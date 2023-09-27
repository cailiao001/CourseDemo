package com.example.sys.controller;


import com.example.sys.entity.Student;
import com.example.sys.service.IStudentService;
import com.example.sys.vo.StudentCourseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author YinDehua
 * @since 2023-05-24
 */
@RestController
@RequestMapping("/sys/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping("/studentCourseVoList")
    public List<StudentCourseVo> studentCourseVoList(Student student){
        return studentService.studentCourseVoList(student.getId());
    }

    @PostMapping("/add")
    public boolean add (@Valid @RequestBody Student student) {
        return studentService.save(student);
    }

    @PutMapping
    public boolean update (@Valid @RequestBody Student student) {
        return studentService.updateById(student);
    }

    @PostMapping("/submit")
    public boolean submit(@RequestBody Student student){
        return studentService.saveOrUpdate(student);
    }

    @DeleteMapping
    public boolean remove(@RequestParam List<Integer> ids){
        return studentService.removeByIds(ids);
    }

    /*@DeleteMapping("/{ids}")
    public boolean remove(@PathVariable List<Integer> ids){
        return studentService.removeByIds(ids);
    }*/
}

