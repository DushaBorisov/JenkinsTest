package com.example.jenkinsstart.controller;

import com.example.jenkinsstart.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @GetMapping(value = "/users")
    public ResponseEntity getAllUsers(){
        return new ResponseEntity(List.of(new User("Andrey", "borisov"), new User("Anton", "Petrov")), HttpStatus.OK);
    }
}
