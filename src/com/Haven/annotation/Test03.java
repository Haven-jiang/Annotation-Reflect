package com.Haven.annotation;

public class Test03 {
    //注解可以显示赋值, 如果没有默认值, 我们必须给注解复制
    @MyAnnotation2(age = 18, name = "Haven", school = {"北京大学", "西部开源"})
    public void test() {}
    @MyAnnotation3("Haven")
    public void test2() {}
}
