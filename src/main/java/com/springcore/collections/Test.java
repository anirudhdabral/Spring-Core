package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		String configPath = "com/springcore/collections/collectionConfig.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configPath);
		Employee emp1 = (Employee) context.getBean("emp1");
		System.out.println(emp1);
		
		((AbstractApplicationContext)context).close();
	}
}
