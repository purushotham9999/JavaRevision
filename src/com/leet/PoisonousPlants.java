package com.leet;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

//https://www.hackerrank.com/challenges/poisonous-plants/problem?isFullScreen=true

public class PoisonousPlants {

	public static void main(String[] args) {

//		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(6, 5, 8, 4, 7, 10, 9));
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(3, 6, 2, 7, 5));

//		System.out.println(poisonousPlants(list));
//		System.out.println(poisonousPlants(list));
		System.out.println("no.Of Days = " + poisonousPlants(Arrays.asList(6, 5, 8, 4, 7, 10, 9)));
//		System.out.println("no.Of Days = " + poisonousPlants(Arrays.asList(4, 3, 7, 5, 6, 4, 2)));
	}

	private static int poisonousPlants(List<Integer> p) {
		p.stream().forEach(System.out::print);
		System.out.println();
		p.stream().forEach(n -> System.out.print(n + " "));
		CopyOnWriteArrayList<Integer> modifiableList = new CopyOnWriteArrayList<Integer>(p);
		int result = 0;
//		while (hasPoisnousPlants(modifiableList)/* && result <2 */) {
			while (hasPoisnousPlants(modifiableList)/* && result <2 */) {
			System.out.println("\n\nPlants on start of day " + result);
//			p.stream().forEach(n -> System.out.print(n + " "));
			System.out.println("modifiableList List" + modifiableList);
			modifiableList.sort((n1,n2)-> n1-n2);
			System.out.println("modifiableList List" + modifiableList);
//			System.out.println();

			CopyOnWriteArrayList<Integer> listCopy = (CopyOnWriteArrayList<Integer>) modifiableList.clone();
			System.out.println("size = " + listCopy.size());
			for (int i = 1; i < listCopy.size(); i++) {
//				System.out.println("i-1 " + (i - 1) + " element = " + listCopy.get(i - 1) + " < " + listCopy.get(i)
//						+ " ==> " + (listCopy.get(i - 1) < listCopy.get(i)));
//				System.out.println("i " + i + " element = " + listCopy.get(i));
				if (listCopy.get(i - 1) < listCopy.get(i)) {
					System.out.println("deadPlant = " + listCopy.get(i));
					modifiableList.remove(i);
					modifiableList.add(i, -1);
//					modifiableList.removeAll(Arrays.asList(listCopy.get(i)));
				}
			}
			modifiableList.removeAll(Arrays.asList(-1));
			System.out.println("modied List" + modifiableList);
			System.out.println("\nPlants on end of day " + result);

			result++;
//			listCopy.stream().forEach(n -> System.out.print(n + " "));
//			System.out.println("copied List" + listCopy);
//			System.out.println();
//			modifiableList.stream().forEach(n -> System.out.print(n + " "));
			System.out.println("modied List" + modifiableList);
			System.out.println("hasPoisnousPlants =" + hasPoisnousPlants(modifiableList));
		}
		System.out.println("Plants at the end");
		modifiableList.stream().forEach(n -> System.out.print(n + " "));
		System.out.println();
		return result;

	}

	private static boolean hasPoisnousPlants(List<Integer> p) {
		// TODO Auto-generated method stub
	
		for (int i = 1; i < p.size(); i++) {
			if (p.get(i - 1) < p.get(i)) {
				return true;
			}
		}
		return false;
	}

}
