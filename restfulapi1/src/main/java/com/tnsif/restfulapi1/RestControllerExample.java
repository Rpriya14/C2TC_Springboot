package com.tnsif.restfulapi1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExample 
{
	@RequestMapping("/Hello")
	public String show()
	{
		return "Welcome";
	}
	@GetMapping("/hello")
	
	public String greetings(@RequestParam String name)
	{
		return "Welcome " + name;
	}
	//dont worry about qn mark
	@GetMapping("/hello/{name}")
	public String message(@PathVariable String name)
	{
		return "Welcome "+name;
	}
}