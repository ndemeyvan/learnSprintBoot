package com.example.demo.models;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * Cette classe represente le model de la table de
 * location qui seront utiliser dans la base de donnee
 * @Entity permet de specifie a spring que ceci est une table dans notre BD
 * */
@Entity
public class Location {

    //@Id permet de dire que ceci est la
    // cle primaire de cette classe
    @Id @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id;
    private String name;

    public Location() {
    }

    public Location(String id, String name) {
        this.id = id;
        this.name = name;
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
}
