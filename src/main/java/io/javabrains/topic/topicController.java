package io.javabrains.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class topicController {
	
	@Autowired
	private TopicService ts;
	
	//this will retrieve List using GET request
	@RequestMapping(method=RequestMethod.GET,value="/topic")
	public List<Topic> getAllTops(){
		return ts.getTheTopics();
	}
	//this will get as well as update using POST method to amend List
		@RequestMapping(method=RequestMethod.POST, value="/topic")
		public void addTopic(@RequestBody Topic top) {
		ts.addTopic(top);

	}
		
			@RequestMapping(method=RequestMethod.PUT, value="/topic/{name}")
			public void addTopic(@RequestBody Topic top, @PathVariable String name) {
			ts.updateTopic(name,top);
	}
			
			@RequestMapping(method=RequestMethod.DELETE, value="/topic/{name}")
			public void deletTopic(@PathVariable String name) {
				
				ts.deleteTopic(name);
			}
	}

	
	//this method uses the lambda method in service, that uses a url path variable of name
	//and renders in browser that matches String passed in
//	@RequestMapping("/topic/{name}")
//	public Topic getMoreTopics(@PathVariable String name) {
		
//		return ts.getTopic("Luke");
//	}
	
	