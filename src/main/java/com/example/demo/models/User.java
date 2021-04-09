package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * Cette classe represente le model de la table de
 * User qui seront utiliser dans la base de donnee
 * @Entity permet de specifie a spring que ceci est une table dans notre BD
 * */
@Entity
public class User {
    //@Id permet de dire que ceci est la
    // cle primaire de cette classe
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private Location location;
    private String email;

    public User() {
    }

    public User(String id, String firstName, String lastName, Location location, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
