package com.tarcio4lmeida.springbootmongodb.service;

import java.util.List;
import java.util.Optional;

import com.tarcio4lmeida.springbootmongodb.domain.User;
import com.tarcio4lmeida.springbootmongodb.dto.UserDTO;
import com.tarcio4lmeida.springbootmongodb.repository.UserRepository;
import com.tarcio4lmeida.springbootmongodb.service.exception.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}

    public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

    public User insert(User obj) {
		return repo.insert(obj);
	}

	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}

    public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}

    private void updateData(User newObj, User obj) {
		newObj.setName(obj.getName());
		newObj.setEmail(obj.getEmail());
	}
    
    public User update(User obj) {
		User newObj = findById(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
	}
}