package com.tcs.entity;

import java.util.ArrayList;
import java.util.List;

public class gymnasium {
	static List<User> users= new ArrayList<User>();
	public static void main(String[] args) {
		
		createUsers();

	}
	private static void createUsers() {
		for(int i=0; i<10; i++) {
		User u1= new User("Ram",987654321, (byte)(10*i));
//		u1.setName("Ram" + i);
//		u1.setAge((byte)(10 * i));
		users.add(u1);
		}
		System.out.println(users);
		users.get(0).workout();
	}
}