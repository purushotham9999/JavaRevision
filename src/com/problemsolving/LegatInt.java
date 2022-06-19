package com.problemsolving;

import java.util.Arrays;

//Legato Interview
public class LegatInt {

	public static void main(String[] args) {

		question1();
		question2();
	}

	private static void question2() {
		// TODO Auto-generated method stub

		// Merge the two sorted lists into a single sorted list. Should not use any
		// existing sorting methods
		// A = [1,2,3,4]
		// B=[5,6,7,8]
		// Result = [1,2,3,4,5,6,7,8]
		//
		// Constraints
		// A is array of n integer numbers
		// B is array of m integer numbers
		//
		// * A = [1,2,3,4] B=[5,6,7,8] Result = [1,2,3,4,5,6,7,8]

		int a[] = { 1, 3, 5, 7 };
		int b[] = { 1, 2, 3, 4, 5 };
		int c[] = new int[a.length + b.length];

		for (int i = 0, j = 0; i < a.length; i++, j++) {
			c[j] = a[i];
		}
		for (int i = 0, j = a.length; i < b.length; i++, j++) {
			c[j] = b[i];
		}

//				for (int i = 0; i < c.length; i++) {
////					System.out.println(c[s]);
		//
//					for (int j = i+1; j < c.length; j++) {
		//
//						if (c[i] < c[j]) {
//							int temp = c[i];
//							c[i] = c[j];
//							c[j] = temp;
//						}
//					}
//				}

		Arrays.sort(c);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}

		/*
		 * List<Integer> list1 = new ArrayList<>();
		 * 
		 * list1.add(1); list1.add(3); list1.add(5); list1.add(7);
		 * 
		 * List<Integer> list2 = new ArrayList<>();
		 * 
		 * list1.add(1); list1.add(2); list1.add(3); list1.add(4); list1.add(5);
		 * 
		 * list1.addAll(list2); list1.forEach(System.out::println);
		 * 
		 * // for (int i = 0; i < list.length; i++) {
		 * 
		 * // }
		 */

	}

	private static void question1() {
		// TODO Auto-generated method stub

		// Question 1: find nums statring with 1
//		12,26,32,52,13
		int nums[] = { 12, 26, 32, 52, 13 };

		Arrays.stream(nums).boxed().toList().stream().
			filter(n -> !(((int) n / 10) > 1)).forEach(System.out::println);

	}
}
