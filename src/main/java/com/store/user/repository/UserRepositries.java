package com.store.user.repository;


import com.store.user.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositries extends JpaRepository<User, Long> {
}
