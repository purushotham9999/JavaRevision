package com.core;

public class SingeltonClass {

	private static SingeltonClass obj = null;

	private SingeltonClass() {

	}

	public static SingeltonClass getInstance() {
		if (obj == null) {
			obj = new SingeltonClass();
		}
		return obj;
	}
}