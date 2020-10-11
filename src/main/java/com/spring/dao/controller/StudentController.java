package com.spring.dao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dao.model.Marks;
import com.spring.dao.model.Student;
import com.spring.dao.repository.StudentDao;

@RestController
public class StudentController {

	@Autowired StudentDao dao;
	
	@GetMapping(name = "/")
	public String greeting() {
		return "Welcome";
	}
	
	@PostMapping("/push")
	public void push(@RequestBody Student student) {
		dao.save(student);
	}
	
	@GetMapping("/pull")
	public List<Student> pull(){
		return dao.findAll();
	}
}
