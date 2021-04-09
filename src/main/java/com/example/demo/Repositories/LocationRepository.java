package com.example.demo.Repositories;

import com.example.demo.models.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, String> {

}
