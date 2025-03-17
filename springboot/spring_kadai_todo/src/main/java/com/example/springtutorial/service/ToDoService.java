package com.example.springtutorial.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springtutorial.entity.ToDo;
import com.example.springtutorial.repository.ToDoRepository;

@Service
public class ToDoService{
	private final ToDoRepository todoRepository;
//	依存正注入
	public ToDoService(ToDoRepository todoRepository) {
		this.todoRepository=todoRepository;
		
	}
//	すべてのリスト取得
	public List<ToDo> getAllToDos(){
		return todoRepository.findAll();
	}
}