package com.chen.learn.annotation;

/**
 * 类名的命名是有讲究的，类名、属性名、变量名一般都是名称，或者是形容词+名称，方法一般是动词，或者动词+名称
 * 以AnnotationTest作为类名和TestAnnotation作为类名是有区别的
 * 前者是注解的测试，符合名词的特征，后者是测试注解，听起来就是一个动作名称，是方法的命名特征
 */
public class AnnotationTest {

    @SuppressWarnings(":deprecation")
    public static void main(String[] args) {
        System.runFinalizersOnExit(true);
    }

    @Deprecated
    public static void sayHello(){
        System.out.println("hi, chen");
    }

    @Override
    public String toString(){
        return "chen";
    }
}
