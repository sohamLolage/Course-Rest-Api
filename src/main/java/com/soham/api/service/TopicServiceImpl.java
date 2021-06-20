package com.soham.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.soham.api.model.Topic;
@Service
public class TopicServiceImpl implements TopicService {
	
	
	private static List<Topic> list;
	
	static {
		list=new ArrayList<>();
		list.add(new Topic(1,"Exception","java concept","How to handle exception in java"));
		list.add(new Topic(2,"Collection","java collection","which type of collection present in java"));
		list.add(new Topic(3,"Thread","java for beginner","Concept of thread"));
		list.add(new Topic(4,"JDBC","java connector","How to communicate with database"));
		
	}
	
	@Override
	public List<Topic> getAllTopic() {
		
		return list;
	}

	@Override
	public Topic getTopic(int id) {
		for(Topic t:list)
		{
			if(t.getTopicId()==id) {
				return t;
			}
		}
		return null;
	}

	@Override
	public Topic updateTopic(Topic topic) {
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getTopicId()==topic.getTopicId()){
				list.set(i, topic);
				return topic;
			}
		}
		return null;
	}

	@Override
	public void deleteTopic(int id) {
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getTopicId()==id) {
				
				list.remove(i);
			}
		}
		
	}

	@Override
	public Topic createTopic(Topic topic) {
		list.add(topic);
		return topic;
	}

}
