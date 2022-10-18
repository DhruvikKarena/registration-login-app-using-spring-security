package com.project.registrationlogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.registrationlogin.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}