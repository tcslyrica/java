package com.tcs.setExamples;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set <User> users = createSet();
		System.out.println(users);
		User userWithSameAge= new User();
		userWithSameAge.setAge(10);;
		users.add(userWithSameAge);
		System.out.println(users);

	}

	private static Set<User> createSet() {
		Set<User> users = new HashSet<User>();
		return users;
		
	}

}
