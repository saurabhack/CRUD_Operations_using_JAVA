package com.StaffTeacher.demo.service;

import com.StaffTeacher.demo.dao.TeacherDAO;
import com.StaffTeacher.demo.entity.Teacher;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService{

    private TeacherDAO teacherDAO;

    @Autowired
    public TeacherServiceImpl(TeacherDAO theTeacherDAO){
        teacherDAO=theTeacherDAO;
    }

    @Override
    public List<Teacher> findAll(){
        return teacherDAO.findAll();
    }

    @Override
    public Teacher findById(int theId){
        return teacherDAO.findById(theId);
    }

    @Transactional
    @Override
    public Teacher save(Teacher theTeacher){
        return teacherDAO.save(theTeacher);
    }

    @Transactional
    @Override
    public void deleteById(int theId){
        teacherDAO.deleteById(theId);
    }

}
