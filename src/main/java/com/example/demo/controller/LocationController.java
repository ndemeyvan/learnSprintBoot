package com.example.demo.controller;

import com.example.demo.model.Location;
import com.example.demo.services.LocationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/*
 * Annotation qui stipule que cette classe est un controller de type REST
 * Elle sera utiliser pour recuperer les requete venant de la part de l'utilisateur
 *  */
@RestController
public class LocationController {

    //ceci marque l'injection de
    // dependance de ctte classe
    @Autowired
    private LocationsService locationsService;


    //cette annotaion permet de dire
    // a spring que ceci est un chemin qui
    // peu etre entrer dans le navigateur type GET par defaut
    //Retourne moi une liste de localite
    @RequestMapping(value ="/locations")
    public List<Location> getAllLocation() {
        return locationsService.getAllLocation();
    }

    //{id} permet de dire que c'est une variable
    //@PathVariable stipule que le parametre de la methode doit venir du endpoind
    @RequestMapping(value ="/locations/{id}")
    public Location getSingleLocation(@PathVariable String id){
        return locationsService.getSingleLocation(id);
    }

}
