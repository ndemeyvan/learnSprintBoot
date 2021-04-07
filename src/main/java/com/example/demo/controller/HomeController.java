package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Annotation qui stipule que cette
// classe est un controller de type REST
@RestController
public class HomeController {

        //cette annotaion permet de dire
        // a spring que ceci est un chemin qui
        // peu etre entrer dans le navigateur type GET par defaut
        @RequestMapping(value = "/welcome")
        public String welcome(){
            return "Welcome to Spring boot";
        }

}
