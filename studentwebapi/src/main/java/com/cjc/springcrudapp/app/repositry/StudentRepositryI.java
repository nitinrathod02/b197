package com.cjc.springcrudapp.app.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.springcrudapp.app.model.Student;

public interface StudentRepositryI extends JpaRepository<Student, Integer>{

}
