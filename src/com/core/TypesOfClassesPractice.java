package com.core;

public class TypesOfClassesPractice {

	public static void main(String[] args) {
		SingeltonClass stc = SingeltonClass.getInstance();
		System.out.println(stc.equals(SingeltonClass.getInstance()));
	}
}
