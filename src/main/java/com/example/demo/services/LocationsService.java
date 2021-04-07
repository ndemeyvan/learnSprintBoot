package com.example.demo.services;

import com.example.demo.model.Location;
import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Annotation qui stipule que cette classe est un service
 * c'est ici que toute la logique des endpoind est implementer
 *  */
@Service
public class LocationsService {

    Location location1 = new Location("l1", "Douala");
    Location location2 = new Location("l2", "Yaounde");
    Location location3 = new Location("l3", "Kribi");

    List<Location> locations = new ArrayList<>(Arrays.asList(location1, location2, location3));


    public List<Location> getAllLocation() {
        return locations;
    }

    public Location getSingleLocation(String id) {
        //ici on utilise les Stream
        //filtre la list des utilisateur , compare la avec l'id qui est filtrer avec chaque element de la liste ,
        // si cela correspond renvoi moi le premier element , sinon renvoi moi null
        Location location = locations.stream().filter(r -> id.equals(r.getId()))
                .findFirst().orElse(null);
        return location;
    }

    public void addLocation(Location location) {
        locations.add(location);
    }

    public void updateLocation(String id,Location location){
        for (int i =0; i < locations.size() ; i++ ){
                Location l = locations.get(i);
                if(l.getId().equals(id)){
                    locations.set(i,location);
                }
        }
    }

}
