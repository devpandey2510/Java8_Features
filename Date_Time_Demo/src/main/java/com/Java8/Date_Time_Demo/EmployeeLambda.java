package com.Java8.Date_Time_Demo;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.*;

public class EmployeeLambda {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		Employee e = new Employee();
	    e.setAge(19);
		e.setName("Dev");
		
		Employee e1 = new Employee();
		e1.setName("Rajesh");
		e1.setAge(29);
		
		Employee e2 = new Employee();
		e2.setName("Shubham");
		e2.setAge(39);
		
		Employee e3 = new Employee();
		e3.setName("Rohit");
		e3.setAge(49);
		
		list.add(e);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		System.out.println("Print age greater than 30");
		//evaluate(list, (n)-> n.getAge() >30);
		list.forEach((n)->{ if(n.getAge()>30) System.out.println(n.getAge()+ " " + n.getName());});
		
		System.out.println(" ");
		System.out.println("All members are");
		evaluate(list,(n)->true);
		
		System.out.println(" ");
		System.out.println("All members are");
		evaluate(list,(n)->false);

	}
	
	public static void evaluate(List<Employee> list, Predicate<Employee> predicate) {
		System.out.println("No. of persons present in list are "+list.size());
		for(Employee n : list) {
			if(predicate.test(n)) {
				System.out.println(n.getName()+" ");
			}
		}
		
	}

}
