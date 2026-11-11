package com.store.user.repository;


import com.store.user.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositries extends MongoRepository<User, String> {
}
