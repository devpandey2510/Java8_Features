package com.Java8.Default_Static;

import java.util.*;

public class Lambda_Demo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		for(Integer n: list) {
			System.out.println(n);
		}
		

		System.out.println(" ");
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list1.forEach((n)->{if(n%2==0) System.out.print(n+" ");});

		System.out.println(" ");
		List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list2.forEach(System.out::println);


	}

}
