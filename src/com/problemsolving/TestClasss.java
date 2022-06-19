package com.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class TestClasss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		List<Integer> ints = new ArrayList<>();

		ints.add(1);
		ints.add(83);
		ints.add(92);
		ints.add(81);
		ints.add(86);

		ints.stream().filter(n -> (n % 2 == 0)).forEach(System.out::println);

	}

}
