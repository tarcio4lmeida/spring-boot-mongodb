package com.tarcio4lmeida.springbootmongodb.service;

import java.util.List;

import com.tarcio4lmeida.springbootmongodb.domain.User;
import com.tarcio4lmeida.springbootmongodb.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}
}