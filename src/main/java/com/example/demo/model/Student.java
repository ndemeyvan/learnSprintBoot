package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

//cette classe marque l'entre dans une nouvelle section du cour avec Java Persistence api (JPA)
//@Entity permet de specifie a spring que ceci est une table dans notre BD
@Entity
public class Student {

        //@Id permet de dire que ceci est la
        // cle primaire de cette classe
        @Id
        private String id;
        private String name;
        private String departement;

    public Student(String id, String name, String departement) {
        this.id = id;
        this.name = name;
        this.departement = departement;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }
}
