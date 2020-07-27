package com.hacknews.scripbox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hacknews.scripbox.ResponseTransfer;
import com.hacknews.scripbox.execption.UserAlreadyExistsException;
import com.hacknews.scripbox.model.User;
import com.hacknews.scripbox.service.SignUpService;



@RestController
@RequestMapping("/signup")
@CrossOrigin("http://localhost:4200")
public class SignUpController {
	@Autowired
	
	private SignUpService signupservice;
	
	
	@PostMapping("/addemployee")
	public ResponseTransfer addUser(@RequestBody User user) throws UserAlreadyExistsException {
		return signupservice.addUser(user);
	}

}
