package com.tarcio4lmeida.springbootmongodb.repository;

import com.tarcio4lmeida.springbootmongodb.domain.Post;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}