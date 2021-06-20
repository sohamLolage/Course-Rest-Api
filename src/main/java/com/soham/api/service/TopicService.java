package com.soham.api.service;

import java.util.List;

import com.soham.api.model.Topic;

public interface TopicService {
	public List<Topic> getAllTopic();
	
	public Topic getTopic(int id);
	
	public Topic updateTopic(Topic topic);
	
	public void deleteTopic(int id);
	
	public Topic createTopic(Topic topic);

}
