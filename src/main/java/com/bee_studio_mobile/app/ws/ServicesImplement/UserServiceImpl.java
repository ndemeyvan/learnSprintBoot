package com.bee_studio_mobile.app.ws.ServicesImplement;

import com.bee_studio_mobile.app.ws.Utils.Utils;
import com.bee_studio_mobile.app.ws.dto.UserDto;
import com.bee_studio_mobile.app.ws.io.entity.UserEntity;
import com.bee_studio_mobile.app.ws.repository.UserRepository;
import com.bee_studio_mobile.app.ws.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

///pour anoter cette classe comme un service
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    Utils utils;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDto createUser(UserDto userDto) {

        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(userDto,userEntity);
        //Genere un userId public
        String publicUserId = utils.generateUSerId(30);
        userEntity.setEncryptedpassword(bCryptPasswordEncoder.encode(userDto.getPassword()));
        userEntity.setUserId(publicUserId);

        if (userRepository.findByEmail(userDto.getEmail())!=null) throw new RuntimeException("Cet email existe deja , veillez le changer");

        UserEntity storedUserDetail = userRepository.save(userEntity);
            UserDto newUserDto = new UserDto();
            BeanUtils.copyProperties(storedUserDetail,newUserDto);
            return newUserDto;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
