package com.StaffTeacher.demo.service;

import com.StaffTeacher.demo.entity.Teacher;

import java.util.List;

public interface TeacherService {

    List<Teacher> findAll();

    Teacher findById(int theId);

    Teacher save(Teacher theTeacher);

    void deleteById(int theId);

    
}
