package com.example.demo.services;
import com.example.demo.model.Location;
import com.example.demo.model.Post;
import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PostsService {
    Post post1 = new Post( "p1", "10 Jan 2021", new User("u1", "Jany", "Lawrence", new Location("l1", "Douala"), "NdemeYvan@gmail.com"),"RAS") ;
    Post post2 = new Post( "p2", "10 Jan 2021", new User("u2", "Cabrel ", "Kemfang", new Location("l2", "Douala"), "CabrelKemfang@gmail.com"),"RAS") ;

    List<Post> listOfPost = Arrays.asList(post1, post2);

    public List<Post> getAllPosts() {
        return listOfPost;
    }
}
