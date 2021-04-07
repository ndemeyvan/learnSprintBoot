package com.example.demo.services;

import com.example.demo.model.Location;
import org.springframework.stereotype.Service;

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
    List<Location> locations = Arrays.asList(location1, location2, location3);


    public List<Location> getAllLocation() {

        return locations;
    }
}
