package com.example.springkadaitodo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Table(name="todos")
@Entity
@Data
public class ToDo {
	@Id
	
    @Column(name="id")
	private Integer Id;
	
	@Column(name="title")
	private String Title;
	
	@Column(name="priority")
	private String Priority;
	
	@Column(name="status")
	private String Status;}
   