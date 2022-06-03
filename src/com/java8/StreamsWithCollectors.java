package com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsWithCollectors {

	public static void main(String[] args) {

		List<EmployeeWithDepartment> empList = new ArrayList<>();

		empList.add(new EmployeeWithDepartment(101, "siva", 101, "active", 2000));
		empList.add(new EmployeeWithDepartment(102, "reddy", 101, "active", 5000));
		empList.add(new EmployeeWithDepartment(103, "raju", 102, "inactive", 6000));
		empList.add(new EmployeeWithDepartment(104, "shivam", 102, "inactive", 4000));
		empList.add(new EmployeeWithDepartment(105, "bob", 103, "active", 3500));
		empList.add(new EmployeeWithDepartment(106, "alice", 103, "inactive", 3500));
		empList.add(new EmployeeWithDepartment(107, "srinu", 104, "active", 3500));

		empList.forEach(System.out::println);
		System.out.println();
		
		empList.stream().collect(Collectors.toMap(EmployeeWithDepartment::getId, Function.identity())).forEach((k, v) -> System.out.println(k + "->" + v));
//
//		empList.stream().collect((Collectors.groupingBy(EmployeeWithDepartment::getDeptId)))
//				.forEach((k, v) -> System.out.println(k + "->" + v));
//
//		System.out.println();
//		Map<Integer, List<EmployeeWithDepartment>> groupedEmps = empList.stream()
//				.collect((Collectors.groupingBy(EmployeeWithDepartment::getDeptId, Collectors.toList())));
//
//		groupedEmps.forEach((k, v) -> System.out.println(k + "->" + v));
//
//		System.out.println();
//
//		empList.stream().collect(Collectors.groupingBy(EmployeeWithDepartment::getDeptId, Collectors.counting()))
//				.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
//
//		System.out.println();
//		empList.stream().filter(emp -> emp.getStatus().equals("active")).forEach(System.out::println);
//		System.out.println("count =" + empList.stream().filter(emp -> emp.getStatus().equals("active")).count());
//
//		System.out.println();
//		empList.stream().filter(emp -> emp.getStatus().equals("inactive")).forEach(System.out::println);
//		System.out.println("count =" + empList.stream().filter(emp -> emp.getStatus().equals("inactive")).count());
//
//		System.out.println();
//		System.out.println(empList.stream().max(Comparator.comparing(EmployeeWithDepartment::getSalary)).get());
//		System.out.println(empList.stream().min(Comparator.comparing(EmployeeWithDepartment::getSalary)).get());
//
//		System.out.println();
//		System.out.println(
//				empList.stream().min((a, b) -> ((Integer) a.getSalary()).compareTo(((Integer) b.getSalary()))).get());
//
//		empList.stream()
//				.collect(Collectors.groupingBy(EmployeeWithDepartment::getDeptId,
//						Collectors.reducing(
//								BinaryOperator.maxBy(Comparator.comparing(EmployeeWithDepartment::getSalary)))))
//				.forEach((k, v) -> System.out.println("dep Id " + k + " top employee -> " + v.get()));
	}

}
