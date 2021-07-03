package com.SpringBootRestService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")

public class UserController {
	/*
	@GetMapping
	public String getUsers() {
		return "http GET request was sent";
		
	}
	*/
	@GetMapping(path="/{userID}") //path parameter
	public String getUser(@PathVariable String userID) {
		return "http GET request was sent for userid:" + userID;
		
	}
	
	@GetMapping
	public String getUsersParameter(@RequestParam(value="page") int pageno,@RequestParam(value="limit") int limitno) {
		return "http GET request was sent for page"+ pageno + "and limit is" + limitno;
		
	}
	
	@PostMapping
	public String createUsers() {
		return "http POST request was sent";
		
	}	
	@PutMapping
	public String updateUsers() {
		return "http update request was sent";
		
	}	

	@DeleteMapping
	public String deleteUsers() {
		return "http delete request was sent";
		
	}

}
