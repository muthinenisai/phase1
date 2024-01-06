package com.ecommerce.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.entity.Todo;

@Controller
public class TodoRestServiceConsumerController {
	
	
	//Fetching a single Todo
		
	@GetMapping("/todo/{id}")
	public String todo(@PathVariable("id") int id, Model model) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		Todo todo = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/"+id, Todo.class);
		
		model.addAttribute("todo", todo);
		
		return "todo-details";		
	}
	
	//Fetching a list of Todo
	@GetMapping("/todos")
	public String todos(Model model) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		Todo[] todos = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos", Todo[].class);
		
		model.addAttribute("todos", todos);
		
		return "todo-list";		
	}
	
	// CHALENGE: Code the todo-list.jsp that shows the todos in a nice table format
	// CHALENGE: Save the todos from the list/single to your TODO table in the DB
	
//	Q: Saving in db do we have to loop through and save everytime?
//	Use	saveAll on the respositry
	

}
