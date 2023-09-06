package com.example.sharedfood.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shared-food")
public class MainController {

    @GetMapping
    public String teste() {
        return "Teste ok";
    }
}
