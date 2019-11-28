package com.zhanghefei.lambda.demo;

import com.zhanghefei.lambda.demo.lambda.Print;

public class LambdaTest {

    private static void print(String s, Print<String> print){
        print.print(s);
    }

    public static void main(String[] args){
        print("ths", System.out::println);
    }
}
