package com.norgini.fullstackbackend.service;

import java.util.List;

import com.norgini.fullstackbackend.model.User;

public interface UserService {
	
	public User saveUser(User user);
	
	public List<User> findAll();

}
