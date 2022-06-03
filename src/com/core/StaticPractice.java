package com.core;

public class StaticPractice {

	public static void main(String[] args) {

//		Parent p 
//		= new Parent();
//		System.out.println(Parent.saticVariable);

		Outer.NestedStatic nestedStatic2 = new Outer.NestedStatic();
		System.out.println(Outer.NestedStatic.nestedStaticVariable);
		System.out.println(nestedStatic2.nestedNonStaticVariable);

		System.out.println("Hello");
	}
}