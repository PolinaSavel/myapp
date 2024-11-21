package com.example.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PeopleController {

    @GetMapping("/people")
    public List<String> getPeople() {
        return List.of("John Doe", "Jane Doe", "Alice Smith");
    }

}
