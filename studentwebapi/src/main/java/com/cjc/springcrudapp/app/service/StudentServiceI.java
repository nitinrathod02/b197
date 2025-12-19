package com.cjc.springcrudapp.app.service;

import java.util.List;

import com.cjc.springcrudapp.app.model.Student;

public interface StudentServiceI {
	
	public Student saveData(Student student);
	public List<Student> getAllData();
	public List<Student> deleteData(int id);
	public Student editData(int id,Student updatedStudent);

}
