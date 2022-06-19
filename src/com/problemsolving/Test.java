package com.problemsolving;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {
		System.out.println("fountainActivation = " + fountainActivation2(Arrays.asList(1, 2, 1)));
		System.out.println("fountainActivation = " + cirularArray(Arrays.asList(1, 2, 1)));
//		System.out.println("fountainActivation = " + fountainActivation(Arrays.asList(1, 1, 1)));
//		System.out.println("fountainActivation = " + fountainActivation2(Arrays.asList(1, 1, 1)));
	}

	private static String cirularArray(List<Integer> endNode) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
		endNode.stream().forEach(n -> map.put(n, 0));
		for (int i = 0; i < endNode.size(); i++) {
			int num = endNode.get(i);

		}

		return null;
	}

	private static int fountainActivation2(List<Integer> locations) {

		int N = locations.size();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = -1;
		}
		int p1;
		int p2;

		for (int i = 0; i < N; i++) {
			p1 = Math.max(i - locations.get(i), 0);
			p2 = Math.min(i + (locations.get(i) + 1), N);
			arr[p1] = Math.max(arr[p1], p2);
		}

		int count = 1;

		int dist = 0;
		p2 = arr[0];

		for (int i = 0; i < N; i++) {
			dist = Math.max(dist, arr[i]);

			if (i == p2) {
				count++;
				p2 = dist;
			}
		}
		return count;
	}

	public static int fountainActivation(List<Integer> locations) {

		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < locations.size(); i++) {
			int p1 = Math.max(((i + 1) - locations.get(i)), 1);
			int p2 = Math.min(((i + 1) + locations.get(i)), locations.size());
			System.out.println(p1 + " " + p2);
			map.put(i, p1 + p2);

		}
		System.out.println(map);
		Entry<Integer, Integer> result = map.entrySet().stream().filter(m -> m.getValue() == (locations.size() + 1))
				.findFirst().orElseGet(null);

		return result.getKey();
	}

}
