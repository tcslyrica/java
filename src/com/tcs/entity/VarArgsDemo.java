package com.tcs.entity;

public class VarArgsDemo {

	public static void main(String[] args) {
		String[] subjects = {"Math", "English"};
		Student student = new Student(subjects);
		System.out.println(student.subjects[0]);
		
		

	}

}

class Student{
	String[] subjects;
	
	public Student(String[] subjects) {
		this.subjects = subjects;
	}
	
	
}