package com.example.demo.Repositories;

import com.example.demo.models.Post;
import com.example.demo.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, String> {
    public List<Post> findByUserId(String userId);

}
