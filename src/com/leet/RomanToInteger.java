package com.leet;

class RomanToInteger {
	public static void main(String[] args) {
		System.out.println(romanToInt("III"));
		System.out.println(romanToInt("MCMXCIV"));
	}

	private static int romanToInt(String s) {

		final int I = 1;
		final int V = 5;
		final int X = 10;
		final int L = 50;
		final int C = 100;
		final int D = 500;
		final int M = 1000;

		int result = 0;
		System.out.println(s.length());
		for (int j = 0; j < s.length(); j++) {
			System.out.println("j =" + j);

			if (s.charAt(j) == 'I') {
				if (j < s.length() - 1 && s.charAt(j + 1) == 'V') {
					result += V - 1;
					j++;
					continue;
				}
				if (j < s.length() - 1 && s.charAt(j + 1) == 'X') {
					result += X - 1;
					j++;
					continue;
				}
				result += I;

			}
			if (s.charAt(j) == 'V') {

				result += V;
			}
			if (s.charAt(j) == 'X') {
				if (j < s.length() - 1 && s.charAt(j + 1) == 'L') {
					result += L - 10;
					j++;
					continue;
				}
				if (j < s.length() - 1 && s.charAt(j + 1) == 'C') {
					result += C - 10;
					j++;
					continue;
				}
				result += X;
			}
			if (s.charAt(j) == 'L') {
				result += L;
			}
			if (s.charAt(j) == 'C') {
				if (j < s.length() - 1 && s.charAt(j + 1) == 'D') {
					result += D - 100;
					j++;
					continue;
				}
				if (j < s.length() - 1 && s.charAt(j + 1) == 'M') {
					result += M - 100;
					j++;
					continue;
				}
				result += C;
			}
			if (s.charAt(j) == 'D') {
				result += D;
			}
			if (s.charAt(j) == 'M') {
				result += M;
			}

		}
		return result;

	}
}