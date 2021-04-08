package com.example.demo.Repository;

import com.example.demo.model.Student;
import org.springframework.data.repository.CrudRepository;

//Le repository a pour but de communiquer avec la BD .
//Ici , il est quest ion de cree une interface qui va herite de
// CrudRepository qui va nous aider a operer les operations de bases sur notre BD (CRUD)
public interface StudentRepository extends CrudRepository <Student, String> {


}
