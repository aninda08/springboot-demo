package com.aninda.springboot.demo.controller;

import java.util.List;

import com.aninda.springboot.demo.entity.Topic;
import com.aninda.springboot.demo.service.TopicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class TopicController {
    
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @RequestMapping(value="/topics", method=RequestMethod.POST)
    public Topic addTopic(@RequestBody Topic topic) {
        return topicService.addTopic(topic);
    }
    
    @RequestMapping(value="/topics/{id}", method=RequestMethod.PUT)
    public Topic updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topic.setId(Integer.parseInt(id));
        return topicService.updateTopic(topic);
    }

    @RequestMapping(value="/topics/{id}", method=RequestMethod.DELETE)
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }
}
