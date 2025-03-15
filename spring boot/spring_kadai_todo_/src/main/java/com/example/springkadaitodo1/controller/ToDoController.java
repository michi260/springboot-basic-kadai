package com.example.springkadaitodo1.controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springkadaitodo1.entity.ToDo;
import com.example.springkadaitodo1.service.ToDoService;

@Controller
public class ToDoController{
//	変数の宣言
	private final ToDoService todoService;
	
	public ToDoController(ToDoService todoService) {
		this.todoService=todoService;
	}
	
//	紐づけ
	@RequestMapping("/todo")
	public String todos(Model model) {
//		ユーザーリスト取得
		List<ToDo> todos=todoService.getAllToDos();
		
//			ビューにデータを渡す
		model.addAttribute("todos", todos);
		
//		ビューの呼び出し
		return "todoView";
	}
}