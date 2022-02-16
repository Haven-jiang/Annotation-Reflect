package com.Haven.annotation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

//什么是注解
//@SuppressWarnings("all") 镇压警告
@SuppressWarnings("all")
public class Test01 {

    //@Override 重写的注解
    @Override
    public String toString() {
        return super.toString();
    }

    //@Deprecated 不推荐程序员使用, 但是可以使用. 或者存在更好的方式
    @Deprecated
    public static void test() {
        System.out.println("Deprecated");
    }

    public void test02(){
        List list = new ArrayList();
    }

    @Test
    public void test01() {
        test();
    }
}
