package com.zhanghefei.lambda.demo.stackoverflow;

public class Teacher {

    private Student student;

    public Teacher() {
        this.student = new Student();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
