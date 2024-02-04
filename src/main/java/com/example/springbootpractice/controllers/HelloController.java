package com.example.springbootpractice.controllers;


import java.util.Arrays;
import java.util.List;
import com.example.springbootpractice.model.Topic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

  @GetMapping("/welcome")
  public String welcome() {
    return "Hello World!";
  }

  @PostMapping("/welcome")
  public String welcome(@RequestBody String name) {
    return "Hello " + name;
  }

  @GetMapping(value = "/topics")
  public List<Topic> getAllTopics() {
    return Arrays.asList(new Topic(1, "Spring Framework", "Spring Framework Description"),
        new Topic(2, "Core Java", "Core Java Description"),
        new Topic(3, "JavaScript", "JavaScript Description"));
  }
}
