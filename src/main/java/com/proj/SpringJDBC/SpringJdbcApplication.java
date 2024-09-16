package com.proj.SpringJDBC;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.proj.SpringJDBC.model.Student;
import com.proj.SpringJDBC.service.StudentService;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

		Student student = context.getBean(Student.class);
		student.setStudentNo(101);
		student.setName("Muhammed");
		student.setMark(100);
		StudentService service = context.getBean(StudentService.class);
		service.addStudent(student);

		List<Student> students = service.getStudents();
		System.out.println(students);
	}

}
