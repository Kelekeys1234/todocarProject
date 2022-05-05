package com.todo.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.todo.service.TodoService;
import com.todo.todo.todoData.Todo;
@RestController
@RequestMapping("todoUser")
public class TodoController {
	@Autowired
	TodoService service;
	
 @PostMapping("/save")
	public Todo save(@RequestBody Todo todo) {
		return service.SaveTodo(todo);
	}
   @GetMapping("getAllTodo")
    public List<Todo> getall(){
    	return service.getAllTodo();
    }
    @PostMapping("{id}")
   public Todo update(@PathVariable("id") Long Id , @RequestBody Todo todo) throws Exception {
    	return service.edit(Id, todo);
		
}
}