package com.bee_studio_mobile.app.ws.service;

import com.bee_studio_mobile.app.ws.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto use);
    UserDto getUser(String email);
}
