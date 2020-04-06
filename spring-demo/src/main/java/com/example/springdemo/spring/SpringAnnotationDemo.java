package com.example.springdemo.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringAnnotationDemo {
    public static void main(String[] args) {
        //xml配置文件驱动  ClassPathXmlApplicationContext
        //Annotation 注解驱动
        //找BeanDfinition
        //@Bean @Configuration
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //注册一个Configuration class = SpringAnnotationDemo
        context.register(SpringAnnotationDemo.class);
        //上下文启动
        context.refresh();
        System.out.println(context.getBean(SpringAnnotationDemo.class));
    }
}
