package com.cice.springrestjpa.controller;

import com.cice.springrestjpa.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired private IUserService userService;

    @PostMapping("/login")
    public String login(@RequestParam("user") String user,@RequestParam("pass") String pass){

        return userService.login(user,pass);
    }
}
