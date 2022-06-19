package com.leet;

import java.util.TreeMap;

class ThreeSumClosest {

	public static void main(String[] args) {
//		System.out.println(threeSumClosest(new int[] { -1, 2, 1, -4 }, 1));
		System.out.println(threeSumClosest(new int[] { 0, 2, 1, -3 }, 1));
		System.out.println(threeSumClosest(new int[] { 0, 0, 0 }, 1));
	}

	public static int threeSumClosest(int[] nums, int target) {

//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		TreeMap<Integer, String> map = new TreeMap<Integer, String>((n1, n2) -> (n1 - n2));

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					int sum = (nums[i] + nums[j] + nums[k]);
					int distance = Math.abs(sum - target);
					map.put(distance, "" + sum);
//					System.out.print(nums[i] + " ," + nums[j] + " ," + nums[k] + " ==> ");
////					System.out.println(nums[i] + nums[j] + nums[k]);
//					System.out.println(sum + "=" + Math.abs(sum - target));
//					System.out.println(Math.abs(1 - 5));
//					System.out.println(1 - 5);
//					map.put(nums[i] + nums[j] + nums[k], new int[] { nums[i], nums[j], nums[k] });
//					map.put(""+sum, Math.abs(sum - target));
				}
			}
		}
//		map.forEach((k, v) -> System.out.println(k + "==>" + v[0] + " ," + v[1] + " ," + v[2]));
		map.forEach((k, v) -> System.out.println(k + " ==> " + v));

//		set.forEach(System.out::print);
//		ArrayList<Integer> list = new ArrayList<>(map.keySet());
//		list.forEach(System.out::println);
//		System.out.println();
//		Collections.sort(list);
//		list.forEach(System.out::println);
//		
//		System.out.println();
//		System.out.println(list.get(0));
//		set.stream().sorted((n1, n2) -> -(n1 - n2))
//				.forEach(n -> System.out.println(n + "-" + target + "=" + (n - target)));

		return Integer.valueOf(map.values().stream().findFirst().orElse(""));
//		return map.firstKey();
//		return IN;
	}

}