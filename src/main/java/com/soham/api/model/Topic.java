package com.soham.api.model;

public class Topic {
	private int topicId;
	private String topicName;
	private String referanceBook;
	private String description;
	
	
	
	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Topic(int topicId, String topicName, String referanceBook, String description) {
		super();
		this.topicId = topicId;
		this.topicName = topicName;
		this.referanceBook = referanceBook;
		this.description = description;
	}

	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getReferanceBook() {
		return referanceBook;
	}
	public void setReferanceBook(String referanceBook) {
		this.referanceBook = referanceBook;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Topic [topicId=" + topicId + ", topicName=" + topicName + ", referanceBook=" + referanceBook
				+ ", description=" + description + "]";
	}
	

}
