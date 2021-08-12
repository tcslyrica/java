package com.tcs.listdemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ArraylistDemo {

	public static void main(String[] args) {
		List<Integer> numbers = createList();
//		System.out.println(numbers);
//		numbers.sort(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o1 -o2;
//			}
//		});
//		System.out.println("after sorting=" + numbers);
		
//		filterList(numbers);
		add(numbers);
	}

	private static void add(List<Integer> numbers) {
		Optional<Integer> sum1 = numbers.stream()
				.reduce((Integer sum, Integer number)->
				{
					System.out.println(sum+","+number);
					return sum + number;
				});
		
		System.out.println(sum1.get());
		
	}

	//method to filter the elements
	private static void filterList(List<Integer> numbers) {
		numbers.forEach((number) -> {
			System.out.println(number%2==0);
		});
		List<Integer> filtered = numbers.stream()
				.filter((number)-> number%2==0)
				.collect(Collectors.toList());
		System.out.println(filtered);
	}

	private static List<Integer> createList() {
		List<Integer> numbers = new ArrayList<Integer>(); //Generics
		numbers.add(1); //autoboxing
//		System.out.println(numbers.get(0));
		
		for (int count=0; count <20;count++) {
			numbers.add(count);
		}
		return numbers;
	}
}
