package com.StudentDataModel.demo.dao;

import com.StudentDataModel.demo.entity.Student;

import java.util.List;

public interface StudentDAO {

    List<Student> findAll();

     Student findById(int theId);

    Student save(Student theStudent);

    void deleteById(int theId);
}
