package com.zhanghefei.lambda.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhanghefei.lambda.demo.service.StudentService;
import com.zhanghefei.lambda.demo.stackoverflow.Student;
import com.zhanghefei.lambda.demo.stackoverflow.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class DemoApplicationTests {

    /** objectMapper工具类 */
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    /** 会出现循环引用的业务类 */
    private static final StudentService STUDENT_SERVICE = new StudentService();

    /**
     * objectMapper转换map
     * @throws JsonProcessingException
     */
    @Test
    public void convert2JsonTest() throws JsonProcessingException {
        Map<String,String> map = new HashMap<>();
        map.put("teacher","student");
        System.out.println(OBJECT_MAPPER.writeValueAsString(map));
    }

    /**
     * objectMapper转换循环依赖出现栈溢出
     * @throws JsonProcessingException
     */
    @Test
    public void stackOverflowTest() throws JsonProcessingException {
        Student student = new Student();
        Teacher teacher = new Teacher();
        student.setTeacher(teacher);
        teacher.setStudent(student);
        System.out.println(OBJECT_MAPPER.writeValueAsString(student));
    }

    /**
     * objectMapper转换lambda表示出现栈溢出
     * @throws JsonProcessingException
     */
    @Test
    public void convertLambda2JsonTest() throws JsonProcessingException {
        System.out.println(OBJECT_MAPPER.writeValueAsString(STUDENT_SERVICE.getFunction()));
    }

}
