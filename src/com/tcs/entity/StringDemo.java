package com.tcs.entity;

public class StringDemo {

	public static void main(String[] args) {
		String s1= "TCS";
		String s2="TCS";
		String s3= s1+s2;
		System.out.println(s1==s2);
		
		StringBuilder sb= new StringBuilder("TCS");
		sb.append(",Banglore");
		System.out.println(sb);

	}

}
