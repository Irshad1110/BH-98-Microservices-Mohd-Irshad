package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	

	private final UserRepository userRepository;
	
	UserService(UserRepository userRepository){
		this.userRepository=userRepository;
	}

	public List<User> getAll() {
		return userRepository.findAll();
	}

	public Optional<User> getUserById(Long id) {
		return userRepository.findById(id);
	}

	public User newUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
	}

	
	
	

}
