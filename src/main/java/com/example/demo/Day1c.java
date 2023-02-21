package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day1c {

	private String color="Green";
    @GetMapping("/")
    public String getMyFav()
    {
        return"My favorite color is"+color;
    }
}
