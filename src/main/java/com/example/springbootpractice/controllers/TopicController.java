package com.example.springbootpractice.controllers;


import java.util.List;
import com.example.springbootpractice.model.Topic;
import com.example.springbootpractice.service.TopicService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topics")
public class TopicController {

  private final TopicService topicService;

  public TopicController(TopicService topicService) {
    this.topicService = topicService;
  }

  @GetMapping(value = "/list")
  public List<Topic> getAllTopics() {
    return topicService.getAllTopics();
  }

}
