package ru.netology.springcloudclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@RestController
public class ClientController {
    @Value("${user.role}")
    private String role;

    @GetMapping(
            value = "/whoami/{username}")
    public String whoami(@PathVariable("username") String username) {
        return String.format("Hello! You're %s and you'll become a %s\n", username, role);
    }
}
