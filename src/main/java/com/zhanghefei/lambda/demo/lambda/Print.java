package com.zhanghefei.lambda.demo.lambda;

@FunctionalInterface
public interface Print<T> {

    public void print(T t);
}
