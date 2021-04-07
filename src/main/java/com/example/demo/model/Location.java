package com.example.demo.model;


/*
* Cette classe represente le model de la table de
* location qui seront utiliser dans la base de donnee
* */
public class Location {
    private String id;
    private String name;

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
