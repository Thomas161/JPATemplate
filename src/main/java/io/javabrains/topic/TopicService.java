package io.javabrains.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//business service, which is injected into a controller
@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;

public List<Topic> topics =new ArrayList<>(Arrays.asList(new Topic("Naomi","11"),
				(new Topic("Ben","12")),
				(new Topic("Jacklyn","13")),
				(new Topic("Luke","14")),
				(new Topic("Fred","15"))));

public List<Topic> getTheTopics(){
	List<Topic> topics = new ArrayList<>();
	topicRepository.findAll().forEach(topics::add);
	return topics;	
}

public void addTopic(Topic topic){
	//saves a topic to repository
	topicRepository.save(topic);	
	}

public void updateTopic( String name,Topic top) {
	topicRepository.save(top);
	}

public void deleteTopic(String name) {
	topicRepository.delete(name);
}


}


/**
 * unimplemented methods
 * UPDATE TOPIC METHOD
 * 	/*
	 * this implementation is when you use a topic object to update and set new list
	 public void updateTopic(String name){
	for(int i =0; i < topics.size();i++) {
	Topic t = topics.get(i);
	if(t.getName().equals(name)) {
		topics.set(i, top);
		return;
		}
		
		*DELETE TOPIC METHOD
		public void deleteTopic(String name) {
	//topics.removeIf(t -> t.getName().equals(name));
	 }
	 
	 * FILTER METHOD USING A LAMBDA
	 * //this method contains a lambda expression that filters through list and retrieves first name called in controller
public Topic getTopic(String name) {
	//return topics.stream().filter(t -> t.getName().equals(name)).findFirst().get();
	return topicRepository.findOne(name);

*GET ALL METHOD
*public List<Topic> getTheTopics(){
	/*
	 * Incorrect Implementations
//return theList;
//	List<TopicRepository> ty = new ArrayList<>();
//	ty.add(0, (TopicRepository) topicRepository.findAll());
//	return ty;
 * */

	

	 
		

	
		
	

