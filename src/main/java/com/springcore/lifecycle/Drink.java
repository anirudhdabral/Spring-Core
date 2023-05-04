package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Drink implements InitializingBean, DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Drink [price=" + price + "]";
	}

	public Drink() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		// init method
		System.out.println("drink: init");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		// destroy method
		System.out.println("drink: destroy");
	}
	

}
