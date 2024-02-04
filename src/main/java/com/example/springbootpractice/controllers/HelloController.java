package com.example.springbootpractice.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

  @RequestMapping(value = "/welcome")
  public String welcome() {
    return "Hello World!";
  }
}
