package com.multithreading;

import java.util.Scanner;

public class NonMultiThreadingApproach {

	public void banking() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Banking activity started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the account no:");
		int acc_no = scan.nextInt();
		Thread.sleep(5000);
		System.out.println("Enter the password:");
		int pass = scan.nextInt();
		Thread.sleep(5000);
		System.out.println("Collect your money");
		System.out.println("Banking activity is completed");
	}

	public void numPrinting() throws InterruptedException {
		System.out.println("Number printing started");
		for (int i = 1; i < 5; i++) {
			System.out.println(i);
			Thread.sleep(3000);
		}
		System.out.println("Number printing completed");
	}

	public void charPrinting() throws InterruptedException {
		System.out.println("Char printing started");
		for (int i = 65; i < 70; i++) {
			System.out.println((char) i);
			Thread.sleep(3000);
		}

		System.out.println("Char printing completed");

	}
}
