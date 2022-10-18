package com.project.registrationlogin.service;

import com.project.registrationlogin.model.User;
import com.project.registrationlogin.web.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);
}
