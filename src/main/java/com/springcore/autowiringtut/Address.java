package com.springcore.autowiringtut;

public class Address {
	private String houseNo;
	private String city;
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", city=" + city + "]";
	}
	

}
