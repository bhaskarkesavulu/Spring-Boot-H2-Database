package com.student.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.student.web.model.Student;
import com.student.web.repository.StudentRepository;

@RestController
public class StudentController 
{
	@Autowired
	StudentRepository repository;
	
	@RequestMapping(value = "/student-list", method = RequestMethod.GET)
	public List<Student> getStudentsList() 
	{
		return repository.findAll();
	}
	
	@RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
	public Student getStudentById(@PathVariable("id")int id) 
	{
		return repository.findById(id).get();
	}
	
	@RequestMapping(value = "/save-student", method = RequestMethod.POST)
	public Student saveStudent(@RequestBody Student student) 
	{
		return repository.save(student);
	}
	
	@RequestMapping(value = "/update-student", method = RequestMethod.PUT)
	public Student updateStudent(@RequestBody Student student) 
	{
		return repository.save(student);
	}
	
	@RequestMapping(value = "/delete-student/{id}", method = RequestMethod.DELETE)
	public void deleteStudentById(@PathVariable("id")int id) 
	{
		repository.deleteById(id);
	}
}
