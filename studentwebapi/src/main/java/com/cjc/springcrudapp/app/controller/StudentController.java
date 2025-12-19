package com.cjc.springcrudapp.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.springcrudapp.app.model.Student;
import com.cjc.springcrudapp.app.service.StudentServiceI;

@RestController
public class StudentController {
	
	@Autowired
	StudentServiceI ssi;
	
	@PostMapping("/save")
	public Student saveData(@RequestBody Student student) {
		
		Student stu=ssi.saveData(student);
		return stu;
	}
	
	@GetMapping("/all")
	public List<Student> getAllData(){
		
		 return ssi.getAllData();
	}
	
	@DeleteMapping("/delete/{id}")
	public List<Student> deleteData(@PathVariable("id")int id){
		
		return ssi.deleteData(id);
				
	}
	
	@PutMapping("/edit/{id}")
	public Student editData(@PathVariable("id")int id,@RequestBody Student updatedStudent){
		
		return ssi.editData(id, updatedStudent);
	}

}
