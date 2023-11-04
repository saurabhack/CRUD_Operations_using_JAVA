package com.StudentDataModel.demo.rest;

import com.StudentDataModel.demo.entity.Student;
import com.StudentDataModel.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private StudentService studentService;

    @Autowired
    public StudentRestController(StudentService theStudentService){
        studentService=theStudentService;
    }

    @GetMapping("/Students")
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @GetMapping("/Students/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        Student theStudent= studentService.findById(studentId);
        if(theStudent==null){
            throw new RuntimeException("Student id not found");
        }
        return theStudent;
    }

    @PostMapping("/Students")
    public Student addStudent(@RequestBody Student theStudent){
        theStudent.setId(0);
        Student dbStudent= studentService.save(theStudent);
        return dbStudent;
    }
    @DeleteMapping("/Students/{studentId}")
    public String deleteStudent(@PathVariable int studentId){
        Student tempStudent = studentService.findById(studentId);

        if(tempStudent==null){
            throw new RuntimeException("Student id not found- "+studentId);
        }

        studentService.deleteById(studentId);

        return "Deleted Student id - "+studentId;
    }

}
