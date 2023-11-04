package com.StudentDataModel.demo.service;

import com.StudentDataModel.demo.dao.StudentDAO;
import com.StudentDataModel.demo.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentDAO studentDAO;

    @Autowired
    public StudentServiceImpl(StudentDAO theStudentDAO){
        studentDAO=theStudentDAO;
    }

    @Override
    public List<Student> findAll(){
        return studentDAO.findAll();
    }

    @Override
    public Student findById(int theId){
        return studentDAO.findById(theId);
    }

    @Transactional
    @Override
    public Student save(Student theStudent){
        return studentDAO.save(theStudent);
    }

    @Transactional
    @Override
    public void deleteById(int theId){
        studentDAO.deleteById(theId);
    }
}
