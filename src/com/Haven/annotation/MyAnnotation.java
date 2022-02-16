package com.Haven.annotation;

import java.lang.annotation.*;

//定义一个注解
//@Target 表示注解可以用在哪些地方
@Target(value = {ElementType.METHOD, ElementType.TYPE})
//@Retention表示注解在什么地方有效
//runtime > class > source
@Retention(value = RetentionPolicy.RUNTIME)
//@Documented 表示注解是否生成在Java doc中
@Documented
//@Inherited 子类可以继承父类的注解
@Inherited
public @interface MyAnnotation {

}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2 {
    //注解的参数 : 参数类型 + 参数名();
    String name() default "";
    int age() default 0;
    int id() default -1; // 如果为-1, 代表不存在

    String[] school();
}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3 {
    String value();
}