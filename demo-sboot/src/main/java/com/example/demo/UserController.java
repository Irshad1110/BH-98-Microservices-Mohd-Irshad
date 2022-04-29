package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	private final UserRepository userRepository;
	private final UserService userService;
	
	UserController(UserRepository userRepository, UserService userService){
		this.userRepository=userRepository;
		this.userService = userService;
	}

	@GetMapping("/users")
	List<User> getAll(){
		return userService.getAll();
	}
	
	@GetMapping("/users/{id}")
	Optional<User> getUserById(@PathVariable Long id){
		return userService.getUserById(id);
	}
	
	@PostMapping("/users")
	User newUser(@RequestBody User user){
		return userService.newUser(user);
	}
	
	@DeleteMapping("/users/{id}")
	void deleteUserById(@PathVariable Long id){
		userService.deleteUserById(id);
	}
}
