package com.example.demo.Repositories;

import com.example.demo.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, String> {
    public List<User> findByLocationId(String locationId); //findBy<ClassName>Field to search
    public List<User> findByFirstName(String firstName); //findBy<ClassName>Field to search
}
