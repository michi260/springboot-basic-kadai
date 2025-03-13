package com.example.springkadaitodo1.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springkadaitodo1.entity.ToDo;
import com.example.springkadaitodo1.repository.ToDoRepository;

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