package com.example.springbootpractice.service;


import java.util.Arrays;
import java.util.List;
import com.example.springbootpractice.model.Topic;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

  private final List<Topic> topics =
      Arrays.asList(new Topic(1, "Spring Framework", "Spring Framework Description"),
          new Topic(2, "Core Java", "Core Java Description"),
          new Topic(3, "JavaScript", "JavaScript Description"));

  public List<Topic> getAllTopics() {
    return topics;
  }

}
