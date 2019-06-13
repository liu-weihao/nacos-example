package com.dx.ss.example.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserConfig config;

    @GetMapping(value = "/status")
    public String getUserStatus() {
        return config.getStatus();
    }
}
