/**
 * 
 */
package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author kumar
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/config.xml");
    	Emp e1 = (Emp) context.getBean("Emp1");
    	System.out.println(e1);
    	System.out.println(e1.getProps().getProperty("username"));
    
	}

}
