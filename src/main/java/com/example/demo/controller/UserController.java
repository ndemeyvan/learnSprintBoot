package com.example.demo.controller;


import com.example.demo.model.Location;
import com.example.demo.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/*
 * Annotation qui stipule que cette classe est un controller de type REST
 * Elle sera utiliser pour recuperer les requete venant de la part de l'utilisateur
 * via api rest qui seront envoyer vers le service des utilisateur ou la logique bussiness est implementer
 *  */
@RestController
public class UserController {


    //cette annotaion permet de dire
    // a spring que ceci est un chemin qui
    // peu etre entrer dans le navigateur type GET par defaut
    //Retourne moi une liste d'utilisateur
    @RequestMapping(value = "/users")
    public List<User> getAllUsers() {
        User user1 = new User("u1", "Jany", "Lawrence", new Location("l1", "Douala"), "NdemeYvan@gmail.com");
        User user2 = new User("u2", "Akah", "Larry", new Location("l1", "Douala"), "akah@gmail.com");
        return Arrays.asList(user1, user2);
    }

}
