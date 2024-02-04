package com.example.springbootpractice.controllers;


import java.util.List;
import com.example.springbootpractice.model.Topic;
import com.example.springbootpractice.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/topics")
public class TopicController {

  @Autowired
  TopicService topicService;

  @GetMapping(value = "/list")
  public @ResponseBody List<Topic> getAllTopics() {
    return topicService.getAllTopics();
  }

}
