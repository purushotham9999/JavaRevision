package com.core;

import java.util.Collections;

public class OverrideStaticPractice {

	static {
		System.out.println("Static block executed even before main() because main and static blcok are in same class");
	}

	public static void main(String[] args) {

		System.out.println("Hello Main Started executing");
//		Child child = new Child("iinfir");

//		Parent p = (Parent) new Child();
//		Child p = new Child();

//		Child p = new Child("childNonStaticVaridable");
//		p.nonStaticMethod();

//		Child.staticMethod();
//		Child c = new Child();

		// Inbuilt classes examples
		System.out.println(Math.abs(-11.2212));
//		Collections.sort();
		
		System.out.println( 1+2+3+"welcome"+4+5);
	}

}
