package com.StaffTeacher.demo.dao;

import com.StaffTeacher.demo.entity.Teacher;

import java.util.List;

public interface TeacherDAO {
    List<Teacher> findAll();

    Teacher findById(int theId);

    Teacher save(Teacher theTeacher);

    void deleteById(int theId);
}
