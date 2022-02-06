package com.codeassestest.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.codeassestest.dto.UserDto;
import com.codeassestest.model.User;

public interface UserService {
	 UserDto getUserById(Integer userId);
	 User saveUser(UserDto userDto);
	 List < UserDto > getAllUsers();
	 void deleteUser(UserDto userDto);
	 void deleteUserById(Integer userId);
	
	void updateUser(UserDto userDto);
	


}

