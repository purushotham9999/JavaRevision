package com.problemsolving.algorithms;

public class Sorts {

	public static void main(String[] args) {
//		simpleBubbleSort(); // O(n^2)
//		bubbleSort();		// O(n^2)
//		selectionSort(); 	// O(n^2)
		insertionSort(); // O(n^2)

	}

	private static void insertionSort() {
		// TODO Auto-generated method stub
		int[] arr = { 7, 8, 3, 1, 2 };

		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key ) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}

		printArray(arr);

	}

	private static void selectionSort() {
		// TODO Auto-generated method stub
		int[] arr = { 7, 8, 3, 1, 2 };

		for (int i = 0; i < arr.length - 1; i++) {
			int smallestIndex = i;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[smallestIndex] > arr[j]) {
					smallestIndex = j;
				}
			}
			int temp = arr[smallestIndex];
			arr[smallestIndex] = arr[i];
			arr[i] = temp;
		}

		printArray(arr);
	}

	private static void simpleBubbleSort() {
		// TODO Auto-generated method stub

		int c[] = { 1, 3, 5, 7, 9, 2, 10, 4, 9 };

		for (int i = 0; i < c.length; i++) {
//		System.out.println(c[s]);

			for (int j = 0; j < c.length; j++) {

				if (c[i] < c[j]) {
					int temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
//		Arrays.stream(c).boxed().toList().forEach(System.out::println);
		printArray(c);
	}

	private static void bubbleSort() {
		// TODO Auto-generated method stub

		int c[] = { 7, 8, 1, 3, 2 };

		/* for (int i = 0; i <= c.length - 2; i++) { */ for (int i = 0; i < c.length - 1; i++) {
			/* for (int j = 0; j <= c.length - 2; j++) { */ for (int j = 0; j < c.length - i - 1; j++) {

				if (c[j] > c[j + 1]) {
					int temp = c[j];
					c[j] = c[j + 1];
					c[j + 1] = temp;
				}
			}
		}
		printArray(c);
	}

	private static void printArray(int[] c) {
		// TODO Auto-generated method stub
		System.out.println();
		for (int i : c) {
			System.out.print(i + " ");

		}

	}
}
