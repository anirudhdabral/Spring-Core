package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		String configPath = "com/springcore/reference/refConfig.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configPath);
		A a =(A) context.getBean("aref");
		System.out.println(a);
		System.out.println(a.getOb().getY());
		((AbstractApplicationContext)context).close();
	}

}
