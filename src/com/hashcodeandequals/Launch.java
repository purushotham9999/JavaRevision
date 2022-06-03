package com.hashcodeandequals;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Launch {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1, "ram", "god");
		Employee emp2 = new Employee(1, "rams", "god");
//		Employee emp2 = new Employee(2, "rams", "gods");
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		System.out.println(emp1.equals(emp2));
		
		HashMap<Employee, String> map = new LinkedHashMap<>();
		map.put(emp1, " da");
		map.put(emp2, " di");
		
		System.out.println(map.get(emp1));
		System.out.println(map.get(emp2));
		
		map.entrySet().forEach(System.out::println);
		
	}

}
