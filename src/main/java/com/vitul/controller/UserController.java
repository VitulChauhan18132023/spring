package com.vitul.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vitul.model.User;
import com.vitul.service.UserService;



@RestController  
public class UserController {

	@Autowired  
	UserService userService;  
	
	@GetMapping("/user")  
	private List<User> getAllUser()   
	{  
	return userService.getAllUsers();  
	}  
	
	@GetMapping("/user/{userid}")  
	private User getUser(@PathVariable("userid") int userid)   
	{  
	return userService.getBooksById(userid);  
	} 
	
	@DeleteMapping("/user/{userid}")  
	private void deleteUser(@PathVariable("userid") int userid)   
	{  
	userService.delete(userid);  
	}
	
	@PostMapping("/user")  
	private int saveBook(@RequestBody User user)   
	{  
	userService.saveOrUpdate(user);  
	return user.getUserid();  
	}  
	
	@PutMapping("/user")  
	private User update(@RequestBody User user)   
	{  
	userService.saveOrUpdate(user);  
	return user;  
	}
	
}
