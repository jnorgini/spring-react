package com.norgini.fullstackbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.norgini.fullstackbackend.model.User;
import com.norgini.fullstackbackend.service.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/user")
	User newUser(@RequestBody User newUser) {
		return service.saveUser(newUser);
	}
	
	@GetMapping("/users")
	List<User> findAll() {
		return service.findAll();
	}

}
