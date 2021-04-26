package com.example.demo.service;

import com.example.demo.model.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "spring frame work", "spring frame work description"),
            new Topic("java", "core java", "java description")
    ));

    public List<Topic> getTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(i -> i.getId().equals(id)).findFirst().get();
    }

    public void add(Topic topic) {
        topics.add(topic);
    }

    public void delete(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}
