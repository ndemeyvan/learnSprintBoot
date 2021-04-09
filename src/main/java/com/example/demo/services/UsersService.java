package com.example.demo.services;

import com.example.demo.Repositories.UserRepository;
import com.example.demo.models.Post;
import com.example.demo.models.User;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsersService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;

    }

    public Optional<User> getSingleUser(String id) {
        return userRepository.findById(id);
    }

    public void addUser(User user) {

        userRepository.save(user);
    }

    public void updateUser(String id,User user){
        userRepository.save(user);

    }

    public void deleteUser(String id) {

        userRepository.deleteById(id);

    }
}
