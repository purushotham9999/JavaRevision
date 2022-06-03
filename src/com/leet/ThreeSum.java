package com.leet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, 
	and nums[i] + nums[j] + nums[k] == 0.

	Notice that the solution set must not contain duplicate triplets.
*/

//Input: nums = [-1,0,1,2,-1,-4] -> sort -> [-4,-1,-1,0,1,2]
//Output: [[-1,-1,2],[-1,0,1]]
public class ThreeSum {

	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4 };

		threeSum(nums).stream().forEach(System.out::println);

	}

	private static List<List<Integer>> threeSum(int[] nums) {

		Set<Integer> ints = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			
		}

		return null;
	}
}
