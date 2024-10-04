package com.authentication_system.login_registration.service;

import com.authentication_system.login_registration.dto.UserRegistrationDto;
import com.authentication_system.login_registration.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
