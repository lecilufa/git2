package com.ckk;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ckk.model.Cat;

@RestController
@EnableAutoConfiguration
public class Example {

	@RequestMapping("/hi")
    String home() {
        return "Hello World! Les";
    }
	
	@RequestMapping("/json")
	Cat json() {
		
		Cat cat = new Cat();
		cat.setName("miao");
		cat.setGender("male");
		
        return cat; 
    }
}
