package com.example.sys.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.sys.entity.Teacher;
import com.example.sys.mapper.ITeacherMapper;
import com.example.sys.service.ITeacherService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author YinDehua
 * @since 2023-05-24
 */
@RestController
@RequestMapping("/sys/teacher")
public class TeacherController {

    @Autowired
    private ITeacherService teacherService;

    //添加
    @PostMapping
    public boolean save (@RequestBody Teacher teacher) {
        if(StringUtils.isEmpty(teacher.getWorkNo())){
            return false;
        }
        LambdaUpdateWrapper<Teacher> UpdateWrapper =new LambdaUpdateWrapper<>();
        UpdateWrapper.eq(Teacher::getWorkNo,teacher.getWorkNo());
        return   teacherService.saveOrUpdate(teacher,UpdateWrapper);
    }

    //修改
    @PutMapping
    public boolean update (@RequestBody Teacher teacher) {
        return teacherService.updateById(teacher);
    }

    //删除
    @DeleteMapping
    public boolean delete ( Integer id) {
        return teacherService.removeById(id);
    }

    //根据条件查询
    @GetMapping
    public List<Teacher> find (String name,Integer sex) {
        LambdaQueryWrapper<Teacher> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(StringUtils.isNotEmpty(name),Teacher::getName,name);
        queryWrapper.eq(!Objects.isNull(sex),Teacher::getSex,sex);
        queryWrapper.orderByDesc(Teacher::getUpdateTime);
        return teacherService.list(queryWrapper);
    }
    //分页查询
    @GetMapping("page")
    public Page<Teacher> page (int currentPage,int pageSize,String name) {
        Page<Teacher> pageInfo = new Page<>(currentPage,pageSize);
        LambdaQueryWrapper<Teacher> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(StringUtils.isNotEmpty(name),Teacher::getName,name);
        return teacherService.page(pageInfo,queryWrapper);
    }
}

