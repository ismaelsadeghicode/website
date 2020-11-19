package com.javatar.website.controller;

import com.javatar.website.domain.User;
import com.javatar.website.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public ResponseEntity<List<User>> users(){
        return ResponseEntity.ok(repository.findAll());
    }
}
