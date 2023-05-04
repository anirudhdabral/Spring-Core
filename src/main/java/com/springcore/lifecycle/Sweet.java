package com.springcore.lifecycle;

public class Sweet {
	private double price;
	
	public void init() {
		System.out.println("init method");
	}
	
	public void destroy() {
		System.out.println("destroy method");
	}
	

	public Sweet() {
		super();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Sweet [price=" + price + "]";
	}
	
}
