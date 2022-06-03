package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetPractice {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<Integer>();

		ts.add(100);
		ts.add(50);
		ts.add(100);
		ts.add(150);
		ts.add(125);
		ts.add(150);
		ts.add(175);

		ts.forEach(System.out::println);

		System.out.println("\nHash set");
		HashSet<Integer> hs = new HashSet<Integer>();

		hs.add(100);
		hs.add(50);
		hs.add(100);
		hs.add(150);
		hs.add(125);
		hs.add(150);
		hs.add(175);

		hs.forEach(System.out::println);

		System.out.println("\nLinkedHashSet");
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();

		lhs.add(100);
		lhs.add(50);
		lhs.add(100);
		lhs.add(150);
		lhs.add(125);
		lhs.add(150);
		lhs.add(175);

		lhs.forEach(System.out::println);

	}

}
