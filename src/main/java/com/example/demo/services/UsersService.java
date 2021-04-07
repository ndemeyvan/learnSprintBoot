package com.example.demo.services;

import com.example.demo.model.Location;
import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UsersService {
    User user1 = new User("u1", "Jany", "Lawrence", new Location("l1", "Douala"), "NdemeYvan@gmail.com");
    User user2 = new User("u2", "Akah", "Larry", new Location("l1", "Douala"), "akah@gmail.com");
    List<User> listOfUser = new ArrayList<>( Arrays.asList(user1, user2));

    public List<User> getAllUsers() {
        return listOfUser;
    }

    public User getSingleUser(String id) {
        //ici on utilise les Stream
        //filtre la list des utilisateur , compare la avec l'id qui est filtrer avec chaque element de la liste ,
        // si cela correspond renvoi moi le premier element , sinon renvoi moi null
        User user = listOfUser.stream().filter(r -> id.equals(r.getId()))
                .findFirst().orElse(null);
        System.out.println("This is the user " + user.getFirstName());
        return user;
    }

    public void addUser(User user) {
        listOfUser.add(user);
    }

    public void updateUser(String id,User user){
        for (int i =0; i < listOfUser.size() ; i++ ){
            User l = listOfUser.get(i);
            if(l.getId().equals(id)){
                listOfUser.set(i,user);
            }
        }
    }
}
