package com.core;

public class Child extends Parent {

	static String childStaticVaridable = "childStaticVaridable";
	String childNonStaticVaridable;

	static {

		System.out.println("Hello from Child static block");
		staticMethod();
	}
	
	{
		System.out.println("Hello from child non static block");
	}

//	@Override
	public static void staticMethod() {
		System.out.println("Hello from child ovverrideen static method");
		System.out.println(childStaticVaridable);
	}

	@Override
	public void nonStaticMethod() {
		System.out.println("Hello from child  nonStaticMethod");
		System.out.println(childStaticVaridable);
		System.out.println(childNonStaticVaridable);
	}

	public Child() {
		// TODO Auto-generated constructor stub
	}

	Child(String childNonStaticVaridable) {
		System.out.println(childStaticVaridable);
		this.childNonStaticVaridable = childNonStaticVaridable;
		{
			System.out.println("non static block in cunstructor");
		}
	}
}
