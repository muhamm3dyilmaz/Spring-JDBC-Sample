package com.proj.SpringJDBC.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {

    // properties
    private int studentNo;
    private String name;
    private int mark;

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student [studentNo=" + studentNo + ", name=" + name + ", mark=" + mark + "]";
    }

}