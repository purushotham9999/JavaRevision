package com.problemsolving;

public class Fact {

	public static void main(String[] args) {
		System.out.println(fact(5));

	}

	private static int fact(int n) {
		return n == 1 ? 1 : n * fact(n - 1);
	}
}
