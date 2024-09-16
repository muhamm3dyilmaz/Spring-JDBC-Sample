package com.proj.SpringJDBC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.SpringJDBC.model.Student;
import com.proj.SpringJDBC.repository.StudentRepository;

@Service
public class StudentService {

    private StudentRepository repository;

    public StudentRepository getRepo() {
        return repository;
    }

    @Autowired
    public void setRepo(StudentRepository repository) {
        this.repository = repository;
    }

    public void addStudent(Student student) {

        repository.save(student);
    }

    public List<Student> getStudents() {

        return repository.findAll();
    }

}
