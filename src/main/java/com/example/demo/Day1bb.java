package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class Day1bb {

	private String studentName="IamNeo";
    @GetMapping("/")
    public String getName()
    {
        return "Welcome"+studentName+"!";
    }
	
}
