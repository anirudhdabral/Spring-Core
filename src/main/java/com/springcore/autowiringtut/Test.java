package com.springcore.autowiringtut;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		String configPath = "com/springcore/autowiringtut/autoConfig.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configPath);
		Employee emp1 =  context.getBean("emp1",Employee.class);
		System.out.println(emp1);
		
		((AbstractApplicationContext)context).close();
	}

}
