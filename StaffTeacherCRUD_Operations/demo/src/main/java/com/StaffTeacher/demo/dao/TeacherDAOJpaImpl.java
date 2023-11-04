package com.StaffTeacher.demo.dao;

import com.StaffTeacher.demo.entity.Teacher;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeacherDAOJpaImpl implements  TeacherDAO{
    private EntityManager entityManager;

    @Autowired
    public TeacherDAOJpaImpl(EntityManager theEntityManager){
        entityManager=theEntityManager;
    }

    @Override
    public List<Teacher> findAll(){
        TypedQuery<Teacher> theQuery= entityManager.createQuery("from Teacher",Teacher.class);
        List<Teacher> teachers=theQuery.getResultList();

        return teachers;
    }

    @Override
    public Teacher findById(int theId){
        Teacher theTeacher=entityManager.find(Teacher.class,theId);
        return theTeacher;
    }

    @Override
    public Teacher save(Teacher theTeacher){
        Teacher dbTeacher= entityManager.merge(theTeacher);
        return dbTeacher;
    }

    @Override
    public void deleteById(int theId){
        Teacher theTeacher=entityManager.find(Teacher.class,theId);
        entityManager.remove(theTeacher);
    }
}
