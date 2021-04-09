package com.example.demo.services;

import com.example.demo.Repositories.LocationRepository;
import com.example.demo.Repositories.PostRepository;
import com.example.demo.models.Location;
import com.example.demo.models.Post;
import com.example.demo.models.User;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class PostsService {
    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts() {
        List<Post> posts = new ArrayList<>();
        postRepository.findAll().forEach(posts::add);
        return posts;
    }

    public Optional<Post> getSinglePost(String id) {
        return postRepository.findById(id);
    }

    public void addPost(Post post) {
        postRepository.save(post);
    }

    public void updatePost(String id, Post post) throws NotFoundException {
        Post updatedPost = postRepository.findById(id).orElseThrow(() -> new NotFoundException("Id not found"));
        if (updatedPost == null) {

        } else {
            if (updatedPost.getDetails() == null) {
                //throws error tell client name  is empty
            } else {
                updatedPost.setDetails(post.getDetails());
                postRepository.save(updatedPost);
            }

        }

    }

    public void deletePost(String id) {
        postRepository.deleteById(id);

    }
}
