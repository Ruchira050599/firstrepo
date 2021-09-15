package com.lti.model;

public class Passenger {
	int passengerId;
	String passengerName;
	String passengerAdd;
	int age; 
	
	public String getPassengerAdd() {
		return passengerAdd;
	}
	public void setPassengerAdd(String passengerAdd) {
		this.passengerAdd = passengerAdd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	
	
}
