package com.codeassestest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.context.WebApplicationContext;

import com.codeassestest.repository.UserRepository;

@SpringBootApplication
public class CodeAssessmentTestVodApplication {
   
	 @Autowired
	 UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(CodeAssessmentTestVodApplication.class, args);
		
		
		
		
		
	
	}

}
