package io.javabrains.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//treats class as a controller
@RestController
public class greetController {
	
	//this annotaion maps to url with /anz http request that returns a RESPONSE
	@RequestMapping("/anz")
	public String sayHi() {
		return "I am in Spring Training";
	}

}
