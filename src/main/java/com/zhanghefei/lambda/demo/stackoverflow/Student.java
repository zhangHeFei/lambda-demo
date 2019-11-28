package com.zhanghefei.lambda.demo.stackoverflow;

public class Student {

    private Teacher teacher;

    public Student() {
        this.teacher = new Teacher();
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
