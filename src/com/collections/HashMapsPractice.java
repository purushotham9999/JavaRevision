package com.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapsPractice {

	public static void main(String[] args) {

		System.out.println("hashMap");
		
		//allowed one null key, multiple null values
		//non-synchronized
		//fail-fast
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("1", "helooo");
		hashMap.put("2", "helooos");
		hashMap.put("3", "heloo9");
		hashMap.put("4", "heloo9");
		hashMap.put("5", null);
		hashMap.put("6", null); //allowed
//		hashMap.put(null, "iiefpwi"); ///allowed
//		hashMap.put(null, null); 
		

		hashMap.forEach((k, v) -> System.out.println(k + " -> " + v));
		
		System.out.println("\nsyncronixed hashMap");
		//allowed one null key, multiple null values
		//synchronized
		//fail-safe
		//slow performance
		Map<String, String> syncMap = Collections.synchronizedMap(hashMap);
		syncMap.forEach((k, v) -> System.out.println(k + " -> " + v));
		
		
		System.out.println("\nhashtable");
		//Legacy class
		//Fail Safe
		//doesn't allow null key or value
		//slow performance
		//object level lock
		Hashtable<String, String> hashtable = new Hashtable<>();
		hashtable.put("1", "helooo");
		hashtable.put("2", "helooos");
		hashtable.put("3", "heloo9");
//		hashtable.put("4", null);// Exception in thread "main" java.lang.NullPointerException//	
//		hashtable.put(null, "heloo9"); // Exception in thread "main" java.lang.NullPointerException//		

		hashtable.forEach((k, v) -> System.out.println(k + " -> " + v));

		System.out.println("\nconcurrentHashMap");
		
		//Fail Safe
		// Synchronized
		//Fast performance
		//segment level lock
//		Map<String, String> concurrentHashMap = new HashMap<>(); // java.util.ConcurrentModificationException
		Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();

		concurrentHashMap.put("1", "helooo");
		concurrentHashMap.put("2", "helooos");
		concurrentHashMap.put("3", "heloo9");
		concurrentHashMap.put("4", "heloo9");
//		concurrentHashMap.put(null, "heloo9"); // Exception in thread "main" java.lang.NullPointerException//		
//		concurrentHashMap.put("5", null); // Exception in thread "main" java.lang.NullPointerException//		
		
		concurrentHashMap.forEach((k, v) -> System.out.println(k + " -> " + v));
		
		Iterator<Entry<String, String>> itr = concurrentHashMap.entrySet().iterator();
		
		System.out.println("\nWhile concurrent modification");
		while (itr.hasNext()) {
			Map.Entry<java.lang.String, java.lang.String> entry = (Map.Entry<java.lang.String, java.lang.String>) itr
					.next();
			concurrentHashMap.put("5", "mwjw");
			System.out.println(entry);
		}
		System.out.println("\nAfter concurrent modification");
		concurrentHashMap.forEach((k, v) -> System.out.println(k + " -> " + v));

	}
}
