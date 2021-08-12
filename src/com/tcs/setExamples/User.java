package com.tcs.setExamples;

import java.util.Comparator;

public class User implements Comparator<User>{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return Integer.toString(age);
	}
	@Override
	public int compare(User u1, User u2) {
		
		return u1.getAge()- u2.getAge();
	}
	
}
