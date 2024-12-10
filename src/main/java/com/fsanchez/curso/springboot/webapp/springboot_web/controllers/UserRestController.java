package com.fsanchez.curso.springboot.webapp.springboot_web.controllers;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsanchez.curso.springboot.webapp.springboot_web.models.User;
import com.fsanchez.curso.springboot.webapp.springboot_web.models.dto.UserDto;



@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {

        User user = new User("Felix", "Sanchez");
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hola mundo Spring boot");


        return userDto;
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
