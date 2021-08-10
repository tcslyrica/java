package com.tcs.entity;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		EnhancedForLoopDemo();
	}

	private static void EnhancedForLoopDemo() {
		int [] numbers = {3,4,-1,2,6};
		for (int number : numbers) {
			if(number%2==0) {
				System.out.println(number);
			}
			
		}
		
	}

	private static void extracted() {
		int[] numbers = new int[10];
		numbers[0]=3;
		numbers[4]=1;
		
		Arrays.sort(numbers,0,numbers.length);
		for(int count=0;count<numbers.length;count++) {
			System.out.println(numbers[count]);
		
		}
	}

}
