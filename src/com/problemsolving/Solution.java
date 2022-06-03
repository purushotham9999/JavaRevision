package com.problemsolving;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfEggs = scanner.nextInt();
		scanner.nextLine();
		int[] eggsWeight = new int[numberOfEggs];
		int eggIndex;
		for (eggIndex = 0; eggIndex < numberOfEggs; eggIndex++) {
			eggsWeight[eggIndex] = scanner.nextInt();
		}
		Arrays.sort(eggsWeight);
		int units = 0;
		int weight;
		for (eggIndex = 0; eggIndex < numberOfEggs; eggIndex++) {
			units++;
			weight = eggsWeight[eggIndex] + 4;
			eggIndex++;
			while (eggIndex < numberOfEggs) {
				if (eggsWeight[eggIndex] <= weight) {
					eggIndex++;
				} else {
					eggIndex--;
					break;
				}
			}
		}
		System.out.println(units);
		scanner.close();
	}

}