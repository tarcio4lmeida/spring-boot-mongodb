package com.tarcio4lmeida.springbootmongodb.repository;

import com.tarcio4lmeida.springbootmongodb.domain.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends MongoRepository<User, String> {

}