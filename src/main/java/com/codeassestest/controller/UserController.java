package com.codeassestest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeassestest.dto.UserDto;
import com.codeassestest.model.User;
import com.codeassestest.service.UserService;

@RequestMapping("/user")
@RestController
public class UserController {
 @Autowired
 UserService userService;

 /*  due to work load i can't able to handled the exceptions,validations,status codes..*/
 /* i used the java 8 features in userconverter and userimpl .... Thank you..*/
 
 
 @GetMapping("/getuserbyid/{userId}")
 public UserDto getUserById( @PathVariable Integer userId) {
  return userService.getUserById(userId);
 
 }
 
 @GetMapping("/getusers")
 public List < UserDto > getAllUsers() {

	 return userService.getAllUsers();
  
 }
 

 @PostMapping("/saveuser")
 public String saveUser(@RequestBody UserDto userDto) {
  
     userService.saveUser(userDto); 
     return "user saved";
      
 }
 
 @DeleteMapping("/deleteuser")
 public String deleteUser(@RequestBody UserDto userDto)
 {
	userService.deleteUser(userDto); 
	return "user deleted";
 }
 
   
 
 
 @DeleteMapping("/deleteuserbyid/{userId}")
 public String deleteUserById(@PathVariable Integer userId)
 {
	 userService.deleteUserById(userId); 
	 return "userdeletedbyid";
	 
 }
 
 @PatchMapping("/updateuser")
 public String  updateUser(@RequestBody UserDto userDto)
 {
	 userService.updateUser(userDto);
	 
	 return "userupdated";
	 
 }
 
 

 
 
 
 
 
 
 



}
