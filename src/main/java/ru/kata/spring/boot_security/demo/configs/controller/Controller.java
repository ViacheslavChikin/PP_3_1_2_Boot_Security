package ru.kata.spring.boot_security.demo.configs.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String hello() {
        return "start";
    }
}
