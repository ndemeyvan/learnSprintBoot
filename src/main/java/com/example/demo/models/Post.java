package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * Cette classe represente le model de la table de
 * Post qui seront utiliser dans la base de donnee
 * @Entity permet de specifie a spring que ceci est une table dans notre BD
 * */
@Entity
public class Post {
    //@Id permet de dire que ceci est la
    // cle primaire de cette classe
    @Id
    private String id;
    private String postdate;
    private User user;
    private String details;

    public Post() {
    }

    public Post(String id, String postdate, User user, String details) {
        this.id = id;
        this.postdate = postdate;
        this.user = user;
        this.details = details;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPostdate() {
        return postdate;
    }

    public void setPostdate(String postdate) {
        this.postdate = postdate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
