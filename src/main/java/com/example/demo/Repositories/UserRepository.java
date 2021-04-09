package com.example.demo.Repositories;

import com.example.demo.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

}
