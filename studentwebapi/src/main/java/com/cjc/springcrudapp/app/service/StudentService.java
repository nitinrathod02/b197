package com.cjc.springcrudapp.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.springcrudapp.app.model.Student;
import com.cjc.springcrudapp.app.repositry.StudentRepositryI;

@Service
public class StudentService  implements StudentServiceI{
	
	@Autowired
	StudentRepositryI sr;

	@Override
	public Student saveData(Student student) {

       Student stu =sr.save(student);
       return stu;
		
	}

	@Override
	public List<Student> getAllData() {
        
        List<Student> list=sr.findAll();
		return list;
	}

	@Override
	public List<Student> deleteData(int id) {
		sr.deleteById(id);
		
		
		return sr.findAll();
	}

	@Override
	public Student editData(int id,Student updatedStudent) {
		Optional<Student> op=sr.findById(id);
		
		if(op.isPresent()) {
			
			Student oldStudent=op.get();
			oldStudent.setName(updatedStudent.getName());
			oldStudent.setMarks(updatedStudent.getMarks());
			oldStudent.setCity(updatedStudent.getCity());
			return sr.save(oldStudent);
		}
		
		System.out.println("user is not present");
		return null;
		
		
	}
	
	

}
