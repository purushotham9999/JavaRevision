package com.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class ThreeSum2 {

	public static void main(String[] args) {

//		Integer[] nums = { -1, 0, 1, 2, -1, -4 };
//		int[] nums = { 1, -1, -1, 0 };
		/*
		 * Integer[] nums = { 4, -9, -13, -9, 0, -12, 12, -14, 12, 1, 3, 5, 5, 8, 2, -2,
		 * 8, 1, 2, -6, -6, 1, 6, -15, -2, 7, -11, 3, -2, 1, 11, 10, 8, 14, 8, -15, 9,
		 * 5, -14, 6, 14, -3, -12, 4, -10, 5, -12, 13, 14, -3, -15, -7, 5, -2, -15, 10,
		 * -10, 11, -2, -5, -2, -5, -10, 13, -14, 14, 13, 2, 4, 7, -6, 3, 11, -3, -15,
		 * -14, 10, 10, 6, 1, -8, -2, 1, 12, 11, 1, 7, 8, -10, 13, -11, 3, -15, -6, -7,
		 * 8, -7, 13, -5, 5, -3, 4, -15, -7, 9, -15, -14, -4, 2, 0, 4, 9, 13, -10, -2,
		 * 10 };
		 */

//		int[] nums = { -2, 0, 1, 1, 2 };
//		int[] nums = { 1,2,-2,-1};
//		int[] nums = { 3, -2, 1, 0 };
//		int[] nums = { -1, 0, 1, 0 };
//		int[] nums = { -13, 5, 13, 12, -2, -11, -1, 12, -3, 0, -3, -7, -7, -5, -3, -15, -2, 14, 14, 13, 6, -11, -11, 5,
//				-15, -14, 5, -5, -2, 0, 3, -8, -10, -7, 11, -5, -10, -5, -7, -6, 2, 5, 3, 2, 7, 7, 3, -10, -2, 2, -12,
//				-11, -1, 14, 10, -9, -15, -8, -7, -9, 7, 3, -2, 5, 11, -13, -15, 8, -3, -7, -12, 7, 5, -2, -6, -3, -10,
//				4, 2, -5, 14, -3, -1, -10, -3, -14, -4, -3, -7, -4, 3, 8, 14, 9, -2, 10, 11, -10, -4, -15, -9, -1, -1,
//				3, 4, 1, 8, 1 };
//		int[] nums = { -1, 1, 0 };
//		int[] nums = { 1, 2, -2, -1 };
		int[] nums = { 34, 55, 79, 28, 46, 33, 2, 48, 31, -3, 84, 71, 52, -3, 93, 15, 21, -43, 57, -6, 86, 56, 94, 74,
				83, -14, 28, -66, 46, -49, 62, -11, 43, 65, 77, 12, 47, 61, 26, 1, 13, 29, 55, -82, 76, 26, 15, -29, 36,
				-29, 10, -70, 69, 17, 49 };
		threeSum(nums).stream().forEach(System.out::println);

	}

	public static List<List<Integer>> threeSum(int[] nums) {

		Set<List<Integer>> result = new LinkedHashSet<List<Integer>>();
		if (nums.length == 0) {
			return new ArrayList<List<Integer>>(result);
		}
		List<Integer> res = IntStream.of(nums).boxed().collect(Collectors.toList());
		if (res.size() >= 3 && res.stream().reduce(Integer::sum).get() == 0) {
			if (res.stream().anyMatch(n -> n != 0) && res.stream().count() == 3) {
				Collections.sort(res);
				result.add(res);
			} else if (res.stream().allMatch(n -> n == 0)) {
				result.add(Arrays.asList(0, 0, 0));
			}
			// return new ArrayList<List<Integer>>(result);
		}

		int kLength = nums.length < 50 ? nums.length : nums.length - 1;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				for (int k = j + 1; k < kLength; k++) {
					List<Integer> ints = Arrays.asList(nums[i], nums[j], nums[k]);
					if (nums[i] + nums[j] + nums[k] == 0) {
						Collections.sort(ints);
						result.add(ints);
					}
				}
			}

		}

		return new ArrayList<List<Integer>>(result);

	}
}