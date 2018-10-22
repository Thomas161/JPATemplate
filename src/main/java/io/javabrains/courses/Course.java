package io.javabrains.courses;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;

import io.javabrains.topic.Topic;

@Entity
public class Course {
	
	
	//foreign key that is mapped to a primary key
	@ManyToOne
	private Topic topic;
	
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	@Id
	private String name;
	private String id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Course(String name, String id, String topicId) {
		super();
		this.name = name;
		this.id = id;
		this.topic = new Topic(topicId,"","");
	}
	public Course() {
		
	}
	
}
