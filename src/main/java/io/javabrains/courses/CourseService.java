package io.javabrains.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//business service, which is injected into a controller
@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;


public List<Course> getCourse(String topicId){
	List<Course> courses = new ArrayList<>();
	courseRepository.findByTopicId(topicId)
	.forEach(courses::add);
	return courses;	
}

public void addCourses(Course course){
	//saves a topic to repository
	courseRepository.save(course);	
	}

public void updateCourse(Course course) {
	courseRepository.save(course);
	}

public void deleteCourse(String name) {
	courseRepository.delete(name);
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

	

	 
		

	
		
	

