package com.example.demo.services;


import com.example.demo.Repository.StudentRepository;
import com.example.demo.model.Student;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        ////.findAll() est la methode qui permet de retourner tous les
        // eleves dans la BD grace a JPA
        List<Student> students = new ArrayList<Student>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }

    public void addStudent(Student student) {
        ////.save() est la methode qui permet de sauvegarder
        // un utilisateur dans la BD grace a JPA
        studentRepository.save(student);
    }

    public Optional<Student> getStudentById(String id) {
        ////.deleteById() est la methode qui permet de recuperer
        // un utilisateur dans la BD grace a JPA
        return studentRepository.findById(id);
    }

    public void updateStudentById(String id, Student student) throws NotFoundException {
        Student student1 = studentRepository.findById(id).orElseThrow(() -> new NotFoundException("Id not found"));
        if (student1 == null) {

        } else {
            if (student.getName() == null || student.getDepartement() == null) {

            } else {
                student1.setName(student.getName());
                student1.setDepartement(student.getDepartement());
                studentRepository.save(student1);
            }

        }

    }

    public void deleteStudentById(String id) {
        ////.deleteById() est la methode qui permet de supprimer
        // un utilisateur dans la BD grace a JPA
        studentRepository.deleteById(id);
    }
}
