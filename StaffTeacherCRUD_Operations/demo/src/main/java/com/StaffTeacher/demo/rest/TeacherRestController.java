package com.StaffTeacher.demo.rest;

import com.StaffTeacher.demo.entity.Teacher;
import com.StaffTeacher.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TeacherRestController {
    private TeacherService teacherService;

    @Autowired
    public TeacherRestController(TeacherService theTeacherService){
        teacherService=theTeacherService;
    }

    @GetMapping("/teachers")
    public List<Teacher> findAll(){
        return teacherService.findAll();
    }

    @GetMapping("/teachers/{teachersId}")
    public Teacher getTeacher(@PathVariable int teachersId){
        Teacher theTeacher= teacherService.findById(teachersId);
        if(theTeacher==null){
            throw new RuntimeException("teacher does not exists in these database");
        }
        return theTeacher;
    }

    @PostMapping("/teachers")
    public Teacher addTeacher(@RequestBody Teacher theTeacher){
        theTeacher.setId(0);
        Teacher dbTeacher=teacherService.save(theTeacher);
        return dbTeacher;
    }

    @PostMapping("/teacher")
    public Teacher updateTeacher(@RequestBody Teacher theTeacher){
        Teacher dbTeacher=teacherService.save(theTeacher);
        return dbTeacher;
    }

    @DeleteMapping("teachers/{teacherId}")
    public String deleteTeacher(@PathVariable int teacherId){
        Teacher theTeacher= teacherService.findById(teacherId);
        if(theTeacher==null){
            throw new RuntimeException("teacher does not exist in these databases");

        }
        teacherService.deleteById(teacherId);
        return "Deleted teacher id-  "+teacherId;
    }

}
