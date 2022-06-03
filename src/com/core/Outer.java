package com.core;

public class Outer {

	static String saticVariable = "saticVariable";
	String nonSaticVariable = "nonSaticVariable";
	static {
		System.out.println("Hello from static block");
	}

	public static class NestedStatic {
		static String nestedStaticVariable = "NestedStaticVariable ";
		String nestedNonStaticVariable  = "nestedNonStaticVariable ";

		static {

			System.out.println("Hello from NestedStatic block");
		}

	}
}
