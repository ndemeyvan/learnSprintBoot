package com.example.demo.services;

import com.example.demo.model.Location;
import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UsersService {
    User user1 = new User("u1", "Jany", "Lawrence", new Location("l1", "Douala"), "NdemeYvan@gmail.com");
    User user2 = new User("u2", "Akah", "Larry", new Location("l1", "Douala"), "akah@gmail.com");
    List<User> listOfUser = Arrays.asList(user1, user2);

    public List<User> getAllUsers() {
        return listOfUser;
    }
}
