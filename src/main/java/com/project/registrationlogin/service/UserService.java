package com.project.registrationlogin.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.project.registrationlogin.model.User;
import com.project.registrationlogin.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}
