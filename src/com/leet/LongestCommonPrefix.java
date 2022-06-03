package com.leet;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = new String[] { "flower", "flow", "flight" };
		strs = new String[] { "flower", "flower", "flower", "flower" };
		strs = new String[] { "c", "acc", "ccc" };
//		strs = new String[] { "dog", "racecar", "car" };
//		System.out.println(new String("flower").subSequence(0, 1));
		System.out.println("result = " + longestCommonPrefix(strs));
	}

	private static String longestCommonPrefix(String[] strs) {
		if (strs.length == 1) {
			return strs[0];
		}
		String result = "";
		for (int i = 1; i <= strs[0].length(); i++) {
			boolean has = hasPrefix(strs, "" + strs[0].subSequence(0, i));
			if (has) {

				System.out.println(strs[0].subSequence(0, i) + " = " + has);
				result = "" + strs[0].subSequence(0, i);
			}
		}

		return result;
	}

	private static boolean hasPrefix(String[] strs, String subString) {

		for (String string : strs) {
			System.out.println("Does " + string + " contain ");
			if (!string.startsWith(subString)) {
				return false;
			}
		}
		return true;
	}
}
