/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author User
 */
public class Test {

    public static void main(String[] args) {
        Resource resource = new ClassPathResource("com/java/applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        
        Hello h = (Hello)factory.getBean("hello");
        System.out.println(h.getMessage());

        ApplicationContext context = new ClassPathXmlApplicationContext("com/java/applicationContext.xml");
        Hello hello = (Hello) context.getBean("hello");
        hello.setMessage("Hello World");
        System.out.println(hello.getMessage());

        ApplicationContext context2 = new AnnotationConfigApplicationContext(Hello.class);
        Hello hello2 = (Hello) context2.getBean("hello");
        hello2.setMessage("Hello");
        System.out.println(hello2.getMessage());

    }
}
