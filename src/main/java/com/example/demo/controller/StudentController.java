package com.example.demo.controller;


import com.example.demo.model.Student;
import com.example.demo.services.StudentService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value="/student",method = RequestMethod.GET)
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping(value="/student/{id}",method = RequestMethod.GET)
    public Optional<Student> getStudent(@PathVariable String id){
        return  studentService.getStudentById(id);
    }


    @RequestMapping(value="/student/{id}",method = RequestMethod.PUT)
    public  void updateStudent(@PathVariable String id,@RequestBody Student student) throws NotFoundException {
        studentService.updateStudentById(id,student);
    }

    @RequestMapping(value="/student/{id}",method = RequestMethod.DELETE)
    public  void deleteStudent(@PathVariable String id){

        studentService.deleteStudentById(id);

    }
    @RequestMapping(value="/student",method = RequestMethod.POST)
    public void addStudents(@RequestBody Student student){

         studentService.addStudent(student);
    }





}
