package com.store.user.controllers;


import com.store.user.dto.UserRequest;
import com.store.user.dto.UserResponce;
import com.store.user.models.User;
import com.store.user.services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserServices userServices;


    @GetMapping()
    public List<UserResponce> getAllUsers() {
        // Logic to retrieve all users from the database
        return userServices.getAllUsers();
    }

    @PostMapping()
    public UserResponce createUser(@RequestBody UserRequest user) {
        // Logic to create a new user in the database
       var res =  userServices.addUser(user);
       return res;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Long id) {
        // Logic to retrieve a user by ID from the database
        var res = userServices.getUserById(id);
        if (res == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(
                            Map.of("message", "User with id " + id + " not found")
                    );
        }
        return ResponseEntity.status(HttpStatus.OK).body(res);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(@PathVariable Long id, @RequestBody User user) {
        var res = userServices.updateUserById(id, user);
        if (res == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(
                            Map.of("message", "invalid request")
                    );
        }
        return ResponseEntity.status(HttpStatus.OK).body(res);
    }
}
