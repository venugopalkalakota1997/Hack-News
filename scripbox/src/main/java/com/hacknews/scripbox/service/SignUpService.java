package com.hacknews.scripbox.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.hacknews.scripbox.ResponseTransfer;
import com.hacknews.scripbox.execption.UserAlreadyExistsException;
import com.hacknews.scripbox.model.User;
import com.hacknews.scripbox.repository.UserRepository;



@Service
public class SignUpService {

	
	@Autowired
	private UserRepository userRepository;
	
	

	@Transactional
	public ResponseTransfer addUser(User user) throws UserAlreadyExistsException {
		// TODO Auto-generated method stub
		User user1 = userRepository.findByid(user.getId());
		
		if (user1 != null) {
			throw new UserAlreadyExistsException();
		} else {
			BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
			user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
			System.err.println(user);
			user.setId(user.getId());
			userRepository.save(user);
			return new ResponseTransfer("Save successfully");
		}
	}

}
