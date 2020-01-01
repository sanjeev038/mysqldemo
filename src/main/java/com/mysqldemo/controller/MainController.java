package com.mysqldemo.controller;

import com.mysqldemo.dao.UserRepository;
import com.mysqldemo.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/mysqldemo")
public class MainController {

    Logger logger = LogManager.getLogger(MainController.class);
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/add-user")
    public @ResponseBody String addNewUser(@RequestParam String first_name,
                                           @RequestParam String last_name,
                                           @RequestParam String primary_mobile_number,
                                           @RequestParam String primary_email) {

        User newUser = new User(first_name, last_name, primary_mobile_number, primary_email);
        logger.info("Creating new user with data:" + newUser.toString());
        newUser = userRepository.save(newUser);
        logger.info("New User created with ID: " + newUser.getId());

        return "saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();

    }
}

