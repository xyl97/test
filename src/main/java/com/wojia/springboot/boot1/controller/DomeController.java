package com.wojia.springboot.boot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DomeController {
    @GetMapping("dd")
    public String dome(){
        return "hhhhh";
    }
}
