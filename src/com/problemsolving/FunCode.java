package com.problemsolving;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FunCode {
	public static void main(String[] args) {

		try {
//			String input = "3,6n15";
//			int reslut = addNumbers("");
//			reslut = addNumbers("1,2");
//			reslut = addNumbers("1,2");
//			reslut = addNumbers("1,2,3,3,3,3");
//			reslut = addNumbers(" 1, 2, 3 ,3 ,3,3 ");
//			reslut = addNumbers("    1,2n3n4n   n4n  4n4 nn44 ");
//			reslut = addNumbers("//;\n1;2");
//			System.out.println("result = " + addNumbers("    1,2n3n4n   n4n4n4 nn44 "));
//			System.out.println("\nresult = " + addNumbers("//;\n1;2"));
//			System.out.println("result = " + addNumbers("//;\n-1;2"));
			System.out.println("result = " + addNumbers("1\n2,3"));
//			System.out.println("result = " + addNumbers("//;\n-1;-2n-3n6"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}

	private static int addNumbers(String input) throws Exception {

		int result = 0;
		if (input.isBlank() || input.isEmpty()) {
			return result;
		} else {
			String[] res;
			if (!input.contains("//")) {
				res = input.trim().split(",|n");
			} else {
				res = input.trim().substring(2).split(input.charAt(2) + "|n");
			}

			List<Integer> numList = Stream.of(res).filter(s -> !s.isBlank() && !s.trim().isEmpty())
					.mapToInt(s -> Integer.parseInt(s.trim())).collect(ArrayList::new, List::add, List::addAll);
			Stream.of(numList).forEach(System.out::println);
			System.out.println("input contains negative =" + numList.stream().anyMatch(n -> n <= 0));
			if (numList.stream().anyMatch(n -> n <= 0)) {

				throw new Exception("negatives not allowed, the neagtives passed = "
						+ numList.stream().filter(n -> n <= 0).toList());
			}
			result = numList.stream().reduce(Integer::sum).get();
//			 forEach(System.out::println);
		}
		return result;
	}
}
