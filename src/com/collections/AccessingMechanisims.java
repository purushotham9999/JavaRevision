package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

public class AccessingMechanisims {

	public static void main(String[] args) {
//		ArrayList<Integer> hs = new ArrayList<Integer>();
		LinkedList<Integer> hs = new LinkedList<Integer>();

		hs.add(100);
		hs.add(50);
		hs.add(100);
		hs.add(150);
		hs.add(125);
		hs.add(150);
		hs.add(175);

//		hs.forEach(System.out::println);

		System.out.println(hs);
		Collections.sort(hs);

		System.out.println(hs);

		System.out.println("\nIterator");
//		Iterator<Integer> itr = hs.iterator();
//		Iterator<Integer> itr = hs.listIterator();
		Iterator<Integer> itr = hs.descendingIterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
			// Demonstration of fail fast vs fail safe
//			hs.add(10); //java.util.ConcurrentModificationException (fail fast)
		}

		System.out.println("\nFailSafe");
		CopyOnWriteArrayList<Integer> cowal = new CopyOnWriteArrayList<Integer>();

		cowal.add(100);
		cowal.add(50);
		cowal.add(100);
		cowal.add(150);
		cowal.add(125);
		cowal.add(150);
		cowal.add(175);

		Iterator<Integer> itr2 = cowal.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
			// Demonstration of fail fast vs fail safe
			cowal.add(10); // java.util.ConcurrentModificationException (fail safe)
		}
	}
}
