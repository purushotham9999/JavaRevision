package com.problemsolving;

public class NumFun {

	public static void main(String[] args) {
		int noOfTimes = findNOccurences(123531, 1);
		System.out.println("noOfTimes = " + noOfTimes);

		int reverseNum = reverseNum(12353);
		System.out.println("noOfTimes = " + reverseNum);

		System.out.println(isArmStrong(54748));
//		System.out.print(MathPowerRecursion.calcPower(3, 3) );
		System.out.print(Math.pow(3, 3));
	}

	private static boolean isArmStrong(int n) {
		// TODO Auto-generated method stub

		int originalNum = n;
		int res = 0;
		while (n >= 1) {
			int rem = n % 10;
//			res += rem * rem * rem;
			res += (int) Math.pow(rem, ("" + originalNum).length());
			n /= 10;
		}
		System.out.println(res);
		return originalNum == res;
	}

	private static int reverseNum(int n) {
		// TODO Auto-generated method stub

		int res = 0;
		while (n > 0) {
			res = res * 10 + (n % 10);
			n /= 10;
		}

		return res;
	}

	private static int findNOccurences(int n, int i) {
		// TODO Auto-generated method stub
		int count = 0;
		while (n > 0) {
			count = (n % 10 == i) ? ++count : count + 0;
			n /= 10;
		}
		return count;
	}

}
