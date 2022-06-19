package com.problemsolving;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {

//		System.out.println("Enter a num to check prime or not: ");
//		boolean res = isPrime(new Scanner(System.in).nextInt());
//		System.out.println(res);

		System.out.println("Enter a num to get num of primes before that: ");
		System.out.println(countPrimes(new Scanner(System.in).nextInt()));

	}

	private static int countPrimes(int n) {
		// TODO Auto-generated method stub
//		int count = 0;
//		for (int i = 0; i < n; i++) {
//			if (isPrime(i)) {
//				count++;
//			}
//		}
		boolean[] notPrime = new boolean[n];
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (notPrime[i] == false) {
				count++;
				for (int j = 2; i * j < n; j++) {
					notPrime[i * j] = true;
				}
			}
		}
		return count;
	}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub

		if (num <= 1)
			return false;
		int n = 2;
		while (n * n <= num) {

			if (num % n == 0) {
				return false;
			}
			n++;
		}
		return true;
	}

}
