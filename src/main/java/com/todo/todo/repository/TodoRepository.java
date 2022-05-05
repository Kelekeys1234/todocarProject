package com.todo.todo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.todo.todoData.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo , Long>{
 List<Todo> findAll();
   
}
