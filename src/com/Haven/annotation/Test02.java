package com.Haven.annotation;

import java.lang.annotation.*;

//测试元注解
@MyAnnotation
public class Test02 {

    @MyAnnotation2(name = "Haven", school = {"西北大学", "西工大"})
    public void test() {

    }
}