package com.java8;

@FunctionalInterface
interface Abc {
	void show();

	default void see() {
		System.err.println("watch");
	}

	static void peek() {
		System.out.println("peeked");
	}
}

class AbcImp implements Abc {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Method Reference");
	}

}

public class Java8InterfacePractice {

	public static void main(String[] args) {
		
		Abc.peek();

		Abc obj = new AbcImp();
//		System.out.println();
		obj.show();
		obj.see();
		Abc.peek();
		Abc ab = () -> System.out.println("@FunctionalInterface implementation");
//		ab.show();
//		Abc abmr = new AbcImp()::show;
//		abmr.show();
		
	}

}
