package com.example.demo.controller;

import com.example.demo.models.Location;
import com.example.demo.services.LocationsService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @RequestMapping(value = "/locations")
    public List<Location> getAllLocation() {
        return locationsService.getAllLocation();
    }

    //{id} permet de dire que c'est une variable
    //@PathVariable stipule que le parametre de la methode doit venir du endpoind
    @RequestMapping(value = "/locations/{id}")
    public Optional<Location> getSingleLocation(@PathVariable String id) {
        return locationsService.getSingleLocation(id);
    }

    //@RequestBody stipule l'objet qui sera passe iic va venir du body de la requete
    @RequestMapping(value = "/locations", method = RequestMethod.POST)
    public void addLocation(@RequestBody Location location) {
        locationsService.addLocation(location);
    }

    //@RequestBody stipule l'objet qui sera passe iic va venir du body de la requete
    @RequestMapping(value = "/locations/{id}", method = RequestMethod.PUT)
    public void updateLocation(@PathVariable String id, @RequestBody Location location) throws NotFoundException {
        locationsService.updateLocation(id, location);
    }

    //@RequestBody stipule l'objet qui sera passe iic va venir du body de la requete
    @RequestMapping(value = "/locations/{id}", method = RequestMethod.DELETE)
    public void deleteLocation(@PathVariable String id) {
        locationsService.deleteLocation(id);
    }

}
