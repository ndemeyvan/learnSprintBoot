package com.example.demo.controller;


import com.example.demo.model.Student;
import com.example.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value="/student",method = RequestMethod.GET)
    public List<Student> getAllStudents(){

        return studentService.getAllStudents();
    }

    @RequestMapping(value="/student/{id}",method = RequestMethod.GET)
    public Student getStudent(@PathVariable String id){

        studentService.getStudent(id);
        return null;
    }


    @RequestMapping(value="/student/{id}",method = RequestMethod.PUT)
    public  void updateStudent(@PathVariable String id){

        studentService.updateStudent(id);

    }

    @RequestMapping(value="/student/{id}",method = RequestMethod.DELETE)
    public  void deleteStudent(@PathVariable String id){

        studentService.deleteStudent(id);

    }
    @RequestMapping(value="/student",method = RequestMethod.POST)
    public void addStudents(@RequestBody Student student){

         studentService.addStudent(student);
    }





}
