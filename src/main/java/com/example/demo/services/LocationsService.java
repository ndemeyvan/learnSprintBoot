package com.example.demo.services;

import com.example.demo.Repositories.LocationRepository;
import com.example.demo.models.Location;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
 * Annotation qui stipule que cette classe est un service
 * c'est ici que toute la logique des endpoind est implementer
 *  */
@Service
public class LocationsService {

    @Autowired
    private LocationRepository locationRepository;


    public List<Location> getAllLocation() {
        List<Location> locations = new ArrayList<>();
        locationRepository.findAll().forEach(locations::add);
        return locations;
    }


    public void addLocation(Location location) {
        locationRepository.save(location);
//        locationsOfLocation.add(location);
    }

    public Optional<Location> getSingleLocation(String id) {
        return locationRepository.findById(id);
        //ici on utilise les Stream
        //filtre la list des utilisateur , compare la avec l'id qui est filtrer avec chaque element de la liste ,
        // si cela correspond renvoi moi le premier element , sinon renvoi moi null
//        Location location = locationsOfLocation.stream().filter(r -> id.equals(r.getId()))
//                .findFirst().orElse(null);
//        return location;
    }


    public void updateLocation(String id, Location location) throws NotFoundException {
        Location updatedLocation = locationRepository.findById(id).orElseThrow(() -> new NotFoundException("Id not found"));
        if (location == null) {

        } else {
            if (location.getName() == null) {
                //throws error tell client name  is empty
            } else {
                updatedLocation.setName(location.getName());
                locationRepository.save(updatedLocation);
            }

        }

//        for (int i =0; i < locationsOfLocation.size() ; i++ ){
//                Location l = locationsOfLocation.get(i);
//                if(l.getId().equals(id)){
//                    locationsOfLocation.set(i,location);
//                }
//        }
    }

    public void deleteLocation(String id) {
//        locationsOfLocation.removeIf(l->l.getId().equals(id));
        locationRepository.deleteById(id);
    }
}
