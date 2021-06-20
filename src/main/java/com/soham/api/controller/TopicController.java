package com.soham.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.soham.api.model.Topic;
import com.soham.api.service.TopicService;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicService;
	
	@GetMapping("/topic")
	public List<Topic> getAllTopic()
	{
		List<Topic> list=topicService.getAllTopic();
		return list;
	}
	@GetMapping("/topic/{id}")
	public Topic getTopic(@PathVariable String id) {
		Topic t=topicService.getTopic(Integer.parseInt(id));
		return t;
	}
	@PutMapping("/topic/{id}")
	public Topic updateTopic(@RequestBody Topic topic) {
		Topic t=topicService.updateTopic(topic);
		return t;
	}
	@DeleteMapping("/topic/{id}")
	public void deleteTopic(@PathVariable Integer id) {
		topicService.deleteTopic(id);
	}
	@PostMapping("/topic")
	public Topic createTopic(@RequestBody Topic topic) {
		Topic t=topicService.createTopic(topic);
		return t;
	}


}
