package com.example.makedecisions.repositories;

import com.example.makedecisions.entities.Options;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OptionsRepository extends MongoRepository<Options, String> { }
