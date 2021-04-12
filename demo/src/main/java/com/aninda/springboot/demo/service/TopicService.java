package com.aninda.springboot.demo.service;

import java.util.List;

import com.aninda.springboot.demo.dao.TopicRepository;
import com.aninda.springboot.demo.entity.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
    
    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public Topic getTopic(String id) {
        return topicRepository.findById(Integer.parseInt(id)).get();
    }

    public Topic addTopic(Topic topic) {
        return topicRepository.save(topic);
    }

    public Topic updateTopic(Topic topic) {
        return topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(Integer.parseInt(id));
    }   
}
