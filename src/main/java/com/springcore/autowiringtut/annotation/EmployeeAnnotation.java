package com.springcore.autowiringtut.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeAnnotation {
	@Autowired
	@Qualifier("address2")
	private AddressAnnotation address;

	public EmployeeAnnotation() {
		super();
	}

	public AddressAnnotation getAddress() {
		return address;
	}

	public void setAddress(AddressAnnotation address) {
		this.address = address;
	}

	public EmployeeAnnotation(AddressAnnotation address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
