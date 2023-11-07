package com.TestCenter.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.TestCenter.dto.UserRegistrationDto;
import com.TestCenter.entity.User;

public interface UserService extends UserDetailsService
{
	//User save(UserRegistrationDto registrationDto) ;
	User save(UserRegistrationDto registrationDto);

}