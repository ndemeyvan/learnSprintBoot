package com.bee_studio_mobile.app.ws.ServicesImplement;

import com.bee_studio_mobile.app.ws.dto.UserDto;
import com.bee_studio_mobile.app.ws.io.entity.UserEntity;
import com.bee_studio_mobile.app.ws.repository.UserRepository;
import com.bee_studio_mobile.app.ws.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

///pour anoter cette classe comme un service
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {

        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(userDto,userEntity);

        userEntity.setEncryptedpassword("root");
        userEntity.setUserId("my_user_id");

        UserEntity storedUserDetail = userRepository.save(userEntity);

        UserDto newUserDto = new UserDto();
        BeanUtils.copyProperties(storedUserDetail,newUserDto);

        return newUserDto;
    }
}
