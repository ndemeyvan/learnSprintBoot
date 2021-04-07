package com.example.demo.services;

import com.example.demo.model.Location;
import com.example.demo.model.Post;
import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PostsService {
    Post post1 = new Post("p1", "10 Jan 2021", new User("u1", "Jany", "Lawrence", new Location("l1", "Douala"), "NdemeYvan@gmail.com"), "RAS");
    Post post2 = new Post("p2", "10 Jan 2021", new User("u2", "Cabrel ", "Kemfang", new Location("l2", "Douala"), "CabrelKemfang@gmail.com"), "RAS");

    List<Post> listOfPost = new ArrayList<>(Arrays.asList(post1, post2));

    public List<Post> getAllPosts() {
        return listOfPost;
    }

    public Post getSinglePost(String id) {
        //ici on utilise les Stream
        //filtre la list des utilisateur , compare la avec l'id qui est filtrer avec chaque element de la liste ,
        // si cela correspond renvoi moi le premier element , sinon renvoi moi null
        Post post = listOfPost.stream().filter(r -> id.equals(r.getId()))
                .findFirst().orElse(null);
        return post;
    }

    public void addPost(Post post) {
        listOfPost.add(post);
    }

    public void updatePost(String id, Post post) {
        for (int i =0; i < listOfPost.size() ; i++ ){
            Post l = listOfPost.get(i);
            if(l.getId().equals(id)){
                listOfPost.set(i,post);
            }
        }

    }

    public void deletePost(String id) {
        listOfPost.removeIf(l->l.getId().equals(id));

    }
}
