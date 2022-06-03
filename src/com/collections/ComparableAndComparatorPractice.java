package com.collections;

import java.util.Collections;
import java.util.LinkedList;

//@FunctionalInterface
interface Abc {
//	void pf();

	static int compare(Employee emp1, Employee emp2) {
		if (emp1.salary > emp2.salary) {
			return 1;
		} else {
			return -1;
		}
	}
}

public class ComparableAndComparatorPractice {

	public static void main(String[] args) {

		LinkedList<Employee> emp = new LinkedList<Employee>();

		emp.add(new Employee("Ram", 21, 5000));
		emp.add(new Employee("Bheems", 19, 2000));
		emp.add(new Employee("Bheem", 45, 1000));
		emp.add(new Employee("Shyam", 35, 8000));
		System.out.println(emp);

//		Collections.sort(emp);// comparable => comapreTo in Emp class

		// Comparator
//		Comparator comparator = new Comparator<Employee>() {
//			@Override
//			public int compare(Employee emp1, Employee emp2) {
//
//				if (emp1.salary > emp2.salary) {
//					return 1;
//				} else {
//					return -1;
//				}
//			}
//		};
//		Collections.sort(emp, new Comparator<Employee>() {
//			@Override
//			public int compare(Employee emp1, Employee emp2) {
//
//				if (emp1.salary > emp2.salary) {
//					return 1;
//				} else {
//					return -1;
//				}
//			}
//		}.reversed());

//		Collections.sort(emp, (Employee emp1, Employee emp2) -> {
//			if (emp1.salary > emp2.salary) {
//				return 1;
//			} else {
//				return -1;
//			}
//		});

//		Collections.sort(emp, Abc::compare);
		Collections.sort(emp, (emp1, emp2) -> (emp1.salary > emp2.salary) ? 1 : -1);

		emp.forEach(System.out::println);
	}
}
