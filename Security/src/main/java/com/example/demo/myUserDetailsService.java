package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class myUserDetailsService implements  UserDetailsService {
	@Autowired
	private UserRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Akash akash=((UserRepo) repo).findByUsername(username);
		if(akash==null) {
			throw new UsernameNotFoundException("error");
			
			
		}
		return new userImp(akash);
		
		
		
	}

}
