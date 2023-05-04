package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//constructor injection

public class Test {

	public static void main(String[] args) {
		String configPath = "com/springcore/ci/ciConfig.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configPath);
		Person p = (Person) context.getBean("person1");
		System.out.println(p);
		
		((AbstractApplicationContext)context).close();
	}

}
