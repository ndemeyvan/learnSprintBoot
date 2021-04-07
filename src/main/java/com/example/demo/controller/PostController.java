package com.example.demo.controller;
import com.example.demo.model.Post;
import com.example.demo.model.User;
import com.example.demo.services.PostsService;
import com.example.demo.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 * Annotation qui stipule que cette classe est un controller de type REST
 * Elle sera utiliser pour recuperer les requete venant de la part de l'utilisateur
 * via api rest qui seront envoyer vers le service de Post ou la logique bussiness est implementer
 *  */
@RestController
public class PostController {

    //ceci marque l'injection de
    // dependance de ctte classe
    @Autowired
    private PostsService postService ;


    //cette annotaion permet de dire
    // a spring que ceci est un chemin qui
    // peu etre entrer dans le navigateur type GET par defaut
    //Retourne moi une liste d'utilisateur
    @RequestMapping(value = "/posts")
    public List<Post> getAllPots(){
        return postService.getAllPosts();
    }

    //{id} permet de dire que c'est une variable
    //@PathVariable stipule que le parametre de la methode doit venir du endpoind
    @RequestMapping(value = "/posts/{id}")
    public Post getSinglePost(@PathVariable String id){
        return postService.getSinglePost(id);
    }

    //@RequestBody stipule l'objet qui sera passe iic va venir du body de la requete
    @RequestMapping(value ="/posts",method = RequestMethod.POST)
    public void addPost(@RequestBody Post post){
        postService.addPost(post);
    }

    //@RequestBody stipule l'objet qui sera passe iic va venir du body de la requete
    @RequestMapping(value ="/posts/{id}",method = RequestMethod.PUT)
    public void updateUser(@PathVariable String id,@RequestBody Post post){
        postService.updatePost(id,post);
    }

    //@RequestBody stipule l'objet qui sera passe iic va venir du body de la requete
    @RequestMapping(value ="/posts/{id}",method = RequestMethod.DELETE)
    public void deletePost(@PathVariable String id){
        postService.deletePost(id);
    }

}
