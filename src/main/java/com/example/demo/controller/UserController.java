package com.example.demo.controller;


import com.example.demo.models.User;
import com.example.demo.services.UsersService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/*
 * Annotation qui stipule que cette classe est un controller de type REST
 * Elle sera utiliser pour recuperer les requete venant de la part de l'utilisateur
 * via api rest qui seront envoyer vers le service des utilisateur ou la logique bussiness est implementer
 *  */
@RestController
public class UserController {

    //ceci marque l'injection de
    // dependance de ctte classe
    @Autowired
    private UsersService userService;


    //cette annotaion permet de dire
    // a spring que ceci est un chemin qui
    // peu etre entrer dans le navigateur type GET par defaut
    //Retourne moi une liste d'utilisateur
    @RequestMapping(value = "/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    //{id} permet de dire que c'est une variable
    //@PathVariable stipule que le parametre de la methode doit venir du endpoind
    @RequestMapping(value = "/users/{id}")
    public Optional<User> getUser(@PathVariable String id) {
        return userService.getSingleUser(id);
    }


    //@RequestBody stipule l'objet qui sera passe iic va venir du body de la requete
    @RequestMapping(value ="/users",method = RequestMethod.POST)
    public void addLocation(@RequestBody User user){
        userService.addUser(user);
    }

    //@RequestBody stipule l'objet qui sera passe iic va venir du body de la requete
    @RequestMapping(value ="/users/{id}",method = RequestMethod.PUT)
    public void updateUser(@PathVariable String id,@RequestBody User user) throws NotFoundException {
        userService.updateUser(id,user);
    }

    //@RequestBody stipule l'objet qui sera passe iic va venir du body de la requete
    @RequestMapping(value ="/users/{id}",method = RequestMethod.DELETE)
    public void deleteLocation(@PathVariable String id){
        userService.deleteUser(id);
    }

    //@RequestBody stipule l'objet qui sera passe iic va venir du body de la requete
    @RequestMapping(value ="/users/location/{id}",method = RequestMethod.GET)
    public List<User> getUserByLocationId(@PathVariable String id){
        return userService.getUserByLocationId(id);
    }

    //@RequestBody stipule l'objet qui sera passe iic va venir du body de la requete
    @RequestMapping(value ="/users/firstName/{firstName}",method = RequestMethod.GET)
    public List<User> getUserByFirstName(@PathVariable String firstName){
        return userService.getUserByFirstName(firstName);
    }
}
