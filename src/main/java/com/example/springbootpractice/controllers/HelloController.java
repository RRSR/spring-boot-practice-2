package com.example.springbootpractice.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/welcome")
  public String welcome() {
    return "Hello World!";
  }

  @PostMapping("/welcome")
  public String welcome(@RequestBody String name) {
    return "Hello " + name;
  }
}
