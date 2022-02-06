package com.codeassestest.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.codeassestest.converter.UserConverter;
import com.codeassestest.dto.UserDto;
import com.codeassestest.model.User;
import com.codeassestest.repository.UserRepository;
import com.codeassestest.service.UserService;


@Service
public class UserServiceimpl implements UserService {
 @Autowired
 UserRepository userRepository;

 @Override
 public UserDto getUserById(Integer userId) {
  return UserConverter.entityToDto(userRepository.getOne(userId));
 }

 @Override
 public User saveUser(UserDto userDto) {
   
	 return userRepository.save(UserConverter.dtoToEntity(userDto));

 }
 //used java 8 here
 @Override
 public List < UserDto > getAllUsers() {
  return userRepository.findAll().stream().map(UserConverter::entityToDto).collect(Collectors.toList());
 }

@Override
public void deleteUser(UserDto userDto) {
	
	userRepository.delete(UserConverter.dtoToEntity(userDto));;
	
	
}


@Override
public void deleteUserById(Integer userId) {
	 
	userRepository.deleteById(userId);
	
}

@Override
public void updateUser(UserDto userDto) {
	userRepository.save(UserConverter.dtoToEntity(userDto));
	
}




}