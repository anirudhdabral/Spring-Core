package com.springcore.autowiringtut.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		String configPath = "com/springcore/autowiringtut/annotation/autoAnnotationConfig.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configPath);
		EmployeeAnnotation emp1 =  context.getBean("emp1",EmployeeAnnotation.class);
		System.out.println(emp1);
		
		((AbstractApplicationContext)context).close();
	}

}
