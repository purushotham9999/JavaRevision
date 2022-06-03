package com.strings;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringsPractice {

	public static void main(String[] args) {

		String s = "hello hello";
		String[] chArr = s.split(" ");
//		for (String string : chArr) {
//			System.out.println(string);
//		}

//		long count = s.chars().filter(c -> c == 'o').peek(System.out::println).count();
//		long count2 = s.chars().filter(c -> c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u').count();
//		System.out.println(count);
//		System.out.println(count2);

		s.chars().mapToObj(x -> (char) x).forEach(System.out::println);
		Map<String, List<Character>> maps = s.chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(Object::toString));
		maps.forEach((k, v) -> System.out.println(k + "->" + v));
		System.out.println();
		Map<String, Long> map = s.chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
		map.forEach((k, v) -> System.out.println(k + "->" + v));

		String str = "a!b14A$acBa";
		System.out.println(str.replaceAll("[^a-z]", ""));
		System.out.println(str.replaceAll("[a-z]", ""));
		System.out.println(str);
	}
}
