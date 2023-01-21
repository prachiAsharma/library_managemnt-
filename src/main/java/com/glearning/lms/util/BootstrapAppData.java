package com.glearning.lms.util;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.transaction.annotation.Transactional;

import com.glearning.lms.model.Role;
import com.glearning.lms.model.User;
import com.glearning.lms.repository.UserJpaRepository;

@Configuration
public class BootstrapAppData {
	
	private final UserJpaRepository userRepository;
	
	public BootstrapAppData(UserJpaRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@EventListener(ApplicationReadyEvent.class)
	@Transactional
	public void insertAppData(ApplicationReadyEvent event) {
		System.out.println("Application is ready :: ");
		System.out.println("Inserting the test data :: ");
		User kiran = new User("kiran", "welcome", "kiran@gmail.com");
		User vinay = new User("vinay", "welcome", "vinay@gmail.com");
		
		Role userRole = new Role("ROLE_USER");
		Role adminRole = new Role("ROLE_ADMIN");
		
		kiran.addRole(userRole);
		
		vinay.addRole(userRole);
		vinay.addRole(adminRole);
		
		this.userRepository.save(kiran);
		this.userRepository.save(vinay);
	}

}
