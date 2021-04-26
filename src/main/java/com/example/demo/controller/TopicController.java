package com.example.demo.controller;

import com.example.demo.model.Topic;
import com.example.demo.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;

    @GetMapping(value = "/topics")
    public List<Topic> getAllTopics() {
        return topicService.getTopics();
    }

    @GetMapping(value = "/topic/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @PostMapping(value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.add(topic);
    }

    @DeleteMapping(value = "/topic/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.delete(id);
    }

}
