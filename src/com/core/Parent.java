package com.core;

public class Parent {

	static String parentStaticVaridable = "parentStaticVaridable";
	String parentNonStaticVaridable;

	static {

		System.out.println("Hello from parent static block");
	}

	public static void staticMethod() {
		System.out.println("Hello from parent static method");
	}
	
	public void nonStaticMethod() {
		System.out.println("Hello from child  nonStaticMethod");
		System.out.println(parentStaticVaridable);
		System.out.println(parentNonStaticVaridable);
	}

	public Parent(String parentNonStaticVaridable) {
		this.parentNonStaticVaridable = parentNonStaticVaridable;
	}

	public Parent() {
		// TODO Auto-generated constructor stub
	}

}
