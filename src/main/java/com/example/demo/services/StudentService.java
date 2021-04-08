package com.example.demo.services;


import com.example.demo.Repository.StudentRepository;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        List<Student> students = new ArrayList<Student>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }

    public void addStudent(Student student) {

    }

    public void getStudent(String id) {

    }


    public void updateStudent(String id) {
    }

    public void deleteStudent(String id) {
    }
}
