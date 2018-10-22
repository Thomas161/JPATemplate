package io.javabrains.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.topic.Topic;



@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;

	@RequestMapping(method=RequestMethod.GET,value="/topic/{name}/courses")
	public List<Course> getCourse(@PathVariable String name){
		return courseService.getCourse(name);
	}

		@RequestMapping(method=RequestMethod.POST, value="/topic/{topicId}/courses/{name}")
		public void addCourse(@RequestBody Course course,@PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		courseService.addCourses(course);

	}
		
			@RequestMapping(method=RequestMethod.PUT, value="/topic/{name}/courses/{name}")
			public void updateCourses(@RequestBody Course course, @PathVariable String topicId,@PathVariable String name) {
				course.setTopic(new Topic(topicId,"",""));
				courseService.updateCourse( course);
			
	}
			
			@RequestMapping(method=RequestMethod.DELETE, value="/topic/{name}/courses/{name}")
			public void deletTopic(@PathVariable String name) {
				
				courseService.deleteCourse(name);
			}
	}

	
	//this method uses the lambda method in service, that uses a url path variable of name
	//and renders in browser that matches String passed in
//	@RequestMapping("/topic/{name}")
//	public Topic getMoreTopics(@PathVariable String name) {
		
//		return ts.getTopic("Luke");
//	}
	
	