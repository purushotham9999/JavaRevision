package com.java8;

import java.util.ArrayList;
import java.util.function.BinaryOperator;

public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> ts = new ArrayList<Integer>();

		ts.add(100);
		ts.add(50);
		ts.add(100);
		ts.add(150);
		ts.add(125);
		ts.add(150);
		ts.add(175);

		ts.stream().map((m) -> m * 25).forEach(System.out::println);
		ts.forEach(MethodReference::doubleit);

		System.out.println("\n\n" + ts.stream().map(i -> i * 2).reduce(0, new BinaryOperator<Integer>() {
			public Integer apply(Integer t, Integer u) {
				return t + u;
			}
		}));

		System.out.println("\n" + ts.stream().map(i -> i * 2).reduce(1, (c, e) -> c + e));
		System.out.println("\n" + ts.stream().map(i -> i * 2).reduce(2, (c, e) -> Integer.sum(c, e)));
		System.out.println("\n" + ts.stream().map(i -> i * 2).reduce(3, Integer::sum));

	}

	public static void doubleit(int i) {
		System.out.print(i * 2 + " ");

	}

}
