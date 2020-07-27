package com.hacknews.scripbox.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hacknews.scripbox.model.User;
import com.hacknews.scripbox.model.Userdto;
import com.hacknews.scripbox.repository.UserRepository;


@Service
public class AppUserDetailsService implements UserDetailsService {

	@Override
	public String toString() {
		return "AppUserDetailsService [UserRepository=" + userRepository + "]";
	}

	@Autowired
	UserRepository userRepository;

	

	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		try {

			Userdto userdto = new Userdto();
			String userName = name;
			name = name.substring(0, name.length() - 1);
			int id=Integer.parseInt(name);
			if (userName.endsWith("u")) {
				User user = userRepository.findByid(id);
				System.err.println(user);
				userdto = new Userdto(user.getUserName(), user.getPassword(), "u");
				AppUser appUser = new AppUser(userdto);
				return appUser;
			}
			return null;

		} catch (Exception e) {
		}
		return null;
	}

}
