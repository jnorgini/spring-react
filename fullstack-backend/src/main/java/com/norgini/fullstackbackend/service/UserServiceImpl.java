package com.norgini.fullstackbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.norgini.fullstackbackend.model.User;
import com.norgini.fullstackbackend.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repository;

	@Override
	public User saveUser(User user) {
		return repository.save(user);
	}

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

}
