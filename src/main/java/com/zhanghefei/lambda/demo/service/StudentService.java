package com.zhanghefei.lambda.demo.service;

import com.zhanghefei.lambda.demo.stackoverflow.Student;
import com.zhanghefei.lambda.demo.stackoverflow.Teacher;

import java.util.function.Function;

public class StudentService {

    private final Student student = new Student();

    private final Teacher teacher = new Teacher();

    public Function getFunction(){
        student.setTeacher(teacher);
        teacher.setStudent(student);
        Function<String,String> function = String::toUpperCase;
        return function;
    }
}
