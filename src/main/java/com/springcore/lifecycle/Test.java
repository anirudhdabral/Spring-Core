package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		String configPath = "com/springcore/lifecycle/lifecycleConfig.xml";
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configPath);
		
//		Sweet s = (Sweet) context.getBean("sweet1");
//		System.out.println(s);
//		context.registerShutdownHook();
		
//		Drink d = (Drink) context.getBean("drink1");
//		System.out.println(d);
		
		Food f =(Food) context.getBean("food1");
		System.out.println(f);
		
		((AbstractApplicationContext)context).close();
	}

}
