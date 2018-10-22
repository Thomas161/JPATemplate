package io.javabrains.topic;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity//creates a object that forms a table in database
public class Topic {
	
	@Id//creates variable as primary key in db
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
	public Topic(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	public Topic(String topicId, String string, String string2) {
		
	}
	public Topic() {}

}
