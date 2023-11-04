package com.StudentDataModel.demo.service;
import com.StudentDataModel.demo.entity.Student;
import java.util.List;
public interface StudentService {

    List<Student> findAll();

    Student findById(int theId);

    Student save(Student theStudent);

    void deleteById(int theId);


}
