package com.example.makedecisions.repositories;

import com.example.makedecisions.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {}
