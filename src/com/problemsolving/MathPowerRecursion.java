package com.problemsolving;

public class MathPowerRecursion {

	public static void main(String[] args) {

		System.out.println(calcPower(2, 5));
	}

	public static int calcPower(int x, int n) {
		// TODO Auto-generated method stub
		if (n == 0) {
			return 1;
		}
		if (x == 0) {
			return 0;
		}

		return x * calcPower(x, n - 1);
	}
}
