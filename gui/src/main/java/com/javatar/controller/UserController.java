package com.javatar.controller;

import com.javatar.domain.User;
import com.javatar.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepository repository;

    @RequestMapping
    public String index(Model model){
        List<User> users = repository.findAll();
        model.addAttribute("users",users);
        return "index";
    }
}
