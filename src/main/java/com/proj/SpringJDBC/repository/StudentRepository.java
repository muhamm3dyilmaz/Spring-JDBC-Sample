package com.proj.SpringJDBC.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.proj.SpringJDBC.model.Student;

@Repository
public class StudentRepository {

	public void save(Student student) {
	
		System.out.println("---> Student Added!");
	}

	public List<Student> findAll() {
		
	List<Student> students=new ArrayList<>();
	return students;
	}

	
}
