package com.example.demo.Repositories;

import com.example.demo.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, String> {

}
