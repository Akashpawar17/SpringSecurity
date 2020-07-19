package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Akash, Long> {



Akash findByUsername(String username);
	


}
