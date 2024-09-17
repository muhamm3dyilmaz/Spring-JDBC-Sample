package com.proj.SpringJDBC.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.proj.SpringJDBC.model.Student;

@Repository
public class StudentRepository {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student student) {
        String sql = "insert into student (studentNo, name, mark) values (?,?,?)";

        int rows = jdbc.update(sql, student.getStudentNo(), student.getName(), student.getMark());
        System.out.println(rows + " Effected!");
    }

    public List<Student> findAll() {

        String sql = "select * from student";

        return jdbc.query(sql, (rs, rowNum) -> {

            Student student = new Student();
            student.setStudentNo(rs.getInt("studentNo"));
            student.setName(rs.getString("name"));
            student.setMark(rs.getInt("mark"));

            return student;
        });
    }

}
