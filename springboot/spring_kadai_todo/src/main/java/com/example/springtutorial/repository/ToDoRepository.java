package com.example.springtutorial.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springtutorial.entity.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo,Integer>{
	
}