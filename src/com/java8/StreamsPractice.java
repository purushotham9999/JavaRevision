package com.java8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.collections.Employee;

public class StreamsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> ts = new ArrayList<Integer>();

		ts.add(100);
		ts.add(50);
		ts.add(100);
		ts.add(99);
		ts.add(189);
		ts.add(106);
		ts.add(73);

		
//		ts.stream().distinct().forEach(System.out::println);
//		System.out.println(
//				"sum =" + ts.stream().reduce(Integer::sum).get()
//				);
//		

//		System.out.println(ts);
//		ts.stream().map((m) -> m * 25).forEach(System.out::println);

//		mapPractice(ts);

		flatMapPractice();

//		filterPractice(ts);

	}

	private static void flatMapPractice() {
		// TODO Auto-generated method stub

		LinkedList<Employee> empList = new LinkedList<>();
		empList.add(new Employee("Ram", 12, 1900, Stream.of("12355", "3394399").collect(Collectors.toList())));
		empList.add(new Employee("Bheem", 14, 1300, Stream.of("98998989", "8938439").collect(Collectors.toList())));
		empList.add(new Employee("Shyam", 16, 2100, Stream.of("13343333", "090990").collect(Collectors.toList())));

		empList.stream().map(e -> e.getSalary()).forEach(System.out::println);
		System.out.println(empList.stream().map(e -> e.getSalary()).reduce((c, e) -> c + e));

		List<List<String>> list = empList.stream().flatMap(e -> Stream.of(e.getPhoneNumbers()))
				.collect(Collectors.toList());
		System.out.println(list);
		List<String> list2 = empList.stream().flatMap(e -> e.getPhoneNumbers().stream()).collect(Collectors.toList());
//				.forEach(System.out::println);
		System.out.println(list2);
	}

	private static void filterPractice(ArrayList<Integer> ts) {
		// TODO Auto-generated method stub

		ts.stream().filter(new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t % 5 == 0;
			}
		}).forEach(t -> System.out.print(t + " "));

		System.out.println();
		ts.stream().filter(i -> i % 2 == 0).map(i -> i / 2).forEach(t -> System.out.print(t + " "));
		System.out.println();
		System.out.println(ts.stream().filter(i -> i % 2 == 0).map(i -> i / 2).reduce(Integer::sum));
		System.out.println(ts.stream().filter(i -> i % 2 == 0).map(i -> i / 2).reduce(Integer::sum).orElseGet(null));
		System.out.println(ts.stream().filter(i -> i % 279 == 0).map(i -> i / 2).findFirst().orElse(0));

	}

	private static void mapPractice(ArrayList<Integer> ts) {

		System.out.println("\n" + ts.stream().map(i -> i * 2).reduce(0, new BinaryOperator<Integer>() {
			public Integer apply(Integer t, Integer u) {
				return t + u;
			}
		}));

		System.out.println("\n" + ts.stream().map(i -> i * 2).reduce(1, (c, e) -> c + e));
		System.out.println("\n" + ts.stream().map(i -> i * 2).reduce(2, (c, e) -> Integer.sum(c, e)));
		System.out.println("\n" + ts.stream().map(i -> i * 2).reduce(3, Integer::sum));

	}

}
