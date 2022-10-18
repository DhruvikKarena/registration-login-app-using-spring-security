package com.project.registrationlogin.service;

import java.util.Arrays;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.registrationlogin.model.Role;
import com.project.registrationlogin.model.User;
import com.project.registrationlogin.repository.UserRepository;
import com.project.registrationlogin.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getFirstName(), registrationDto.getLastName(), registrationDto.getEmail(), 
        registrationDto.getPassword(), Arrays.asList(new Role("ROLE_USER")));

    
        return userRepository.save(user);
    }
    
}
