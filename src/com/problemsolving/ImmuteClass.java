package com.problemsolving;

public class ImmuteClass {

	private int id;

	String s;

	public ImmuteClass(int id, String s) {
		super();
		this.id = id;
		this.s = s;
	}
	private ImmuteClass() {
		// TODO Auto-generated constructor stub
	}

	public ImmuteClass getInstance(ImmuteClass immute) {

		if (immute != null) {
			return new ImmuteClass();
		}
		return immute;
	}

}
