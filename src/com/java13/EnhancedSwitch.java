package com.java13;

import java.util.Scanner;

public class EnhancedSwitch {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String fruit = input.nextLine();

		switch (fruit) {
		case "Mango" -> {
			System.out.println("King of fruits");
			System.out.println("Mango of fruits");
		}
		case "Apple" -> System.out.println("Apple of fruits");
		case "Orange" -> System.out.println("Orange of fruits");
		case "Grapes" -> System.out.println("Grapes of fruits");
		default -> System.out.println("Enter a valid fruit");
		}

		int num = input.nextInt();
		switch (num) {
		case 1, 2, 3, 4, 5 -> System.out.println("WeekDay");
		case 6, 7 -> System.out.println("WeekEnd");
		default -> System.out.println("Enter a valid number");
		}

	}

}
