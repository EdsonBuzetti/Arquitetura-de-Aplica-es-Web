package com.example.JWT_RestAPI.repository;

import com.example.JWT_RestAPI.model.LoginRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<LoginRequest, String> {
}

