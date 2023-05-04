package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Food {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Food [price=" + price + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("food: start");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("food: end");
	}

}
