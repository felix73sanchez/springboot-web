package com.fsanchez.curso.springboot.webapp.springboot_web.controllers;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsanchez.curso.springboot.webapp.springboot_web.models.User;
import com.fsanchez.curso.springboot.webapp.springboot_web.models.dto.UserDto;



@RestController
@RequestMapping("/api/v1")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {

        User user = new User("Felix", "Sanchez");
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hola mundo Spring boot");


        return userDto;
    }

    @GetMapping("/list")    
    public List<User> list() {        
        User user = new User("Felix", "Sanchez");
        User user2 = new User("Pepe", "Doe");
        User user3 = new User("Jhon", "Sanchez");

        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        users.add(user3);

        return users;
    }

    @GetMapping("/details-map")
    public Map<String, Object> detailsMap() {

        User user = new User("Felix", "Sanchez");

        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola mundo Spring boot");
        body.put("user", user);
        


        return body;
    }
}
