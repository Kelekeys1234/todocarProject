package com.todo.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.todo.repository.TodoRepository;
import com.todo.todo.todoData.Todo;


@Service
public class TodoService {
	@Autowired
     TodoRepository todoRepository;
	
	 public Todo SaveTodo(Todo todo) {
		 return todoRepository.save(todo);
	 }
	 
	 public List<Todo> getAllTodo(){
		 return todoRepository.findAll();
	 }
	 
	 public Todo edit(Long id , Todo todo) throws Exception {
		 Todo todos =todoRepository.findById(id).orElseThrow(()->  new Exception(" Noting to update"));
		 todos.setCarName(todo.getCarName());
		 todo.setBrand(todo.getBrand());
		 todo.setPrice(todo.getPrice());
		 todoRepository.save(todo);
		 return todo;
		 
	 }
}

