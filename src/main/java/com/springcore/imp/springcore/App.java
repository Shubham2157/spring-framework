package com.springcore.imp.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	Student s1 = (Student) context.getBean("student1");
    	System.out.print(s1);
    	Student s2 = (Student) context.getBean("student2");
    	System.out.print(s2);
    	Student s3 = (Student) context.getBean("student3");
    	System.out.print(s3);
    }
}
