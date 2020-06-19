package com.epam.vaultdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("${user}")
    private String user;

    @RequestMapping("")
    public String getUser() {
        return String.format("Hello %s!", user);
    }
}
