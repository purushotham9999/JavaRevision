package com.problemsolving;

public class Fibanocci {
	public static void main(String[] args) {
		printFibonacci(7);
		System.out.println();
		System.out.println(getNthFibonacci(7));

		// using recursion
		int a = 0;
		int b = 1;

//		int c = a + b;
		System.out.print(a + " " + b + " " /* + c + " " */);
		printFibonacciUsingReursion(7 - 2, a, b);
	}

	private static int getNthFibonacci(int n) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;

//		int c = 0;
//		System.out.print(a + " " + b + " ");
		for (int i = 0; i < n -2; i++) {

			int temp = b;
			b = a + b;
			a = temp;

		}
		return b;
	}

	private static void printFibonacciUsingReursion(int n, int a, int b) {
		// TODO Auto-generated method stub

		if (n == 0) {
			return;
		}
		System.out.print(a + b + " ");
		printFibonacciUsingReursion(n - 1, b, a + b);

	}

	private static void printFibonacci(int n) {
		// TODO Auto-generated method stub

		int a = 0;
		int b = 1;

		int c = 0;
		System.out.print(a + " " + b + " ");
		for (int i = 0; i < n - 2; i++) {

			c = a + b;
			a = b;
			b = c;

			System.out.print(c + " ");
		}
	}

}
