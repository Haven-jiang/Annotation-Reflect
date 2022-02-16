package com.Haven.reflection;

public class Test04 {
    public static void main(String[] args) {
        int m = 150;
        A a = new A();
        System.out.println(A.m);
        System.out.println(a.getClass());
        System.out.println(A.class);
    }
}

class A {
    public static int m = 100;
    public A() {
        System.out.println("A类的无参构造初始化");
    }
    static {
        System.out.println("A类静态代码块初始化");
        int m = 300;
    }
}