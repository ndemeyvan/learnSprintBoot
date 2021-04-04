package com.bee_studio_mobile.app.ws.repository;

import com.bee_studio_mobile.app.ws.io.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//CrudRepository permet d'avoir acces
// a plusieur methodes preconcu pour nous
@Repository
public interface UserRepository extends CrudRepository<UserEntity,Long> {
}
