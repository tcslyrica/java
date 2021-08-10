package com.tcs.entity;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User1 user1= new User1();
		user1.work();
		user1.work(4);
		user1.work("4");

	}
}
	
	class User1 {
		 
	public void work() {
			System.out.println("the user is working");
		}
	public void work(int duration) {
		System.out.println("user is working for " +duration+ "hours ");
	}
	public void work(String duration) {
		System.out.println("user is working for " +duration+ "hours ");
	}
	
	}
	
class Employee1 extends User1 { //inheritance
	@Override
	public void work() {
		System.out.println("Employee is working");
	}
	
	//overload
	public void work (boolean duration) {
		System.out.println("user is working for " +duration+ "hours ");
	}
	
	
}

