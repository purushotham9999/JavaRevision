package com.hashcodeandequals;

public class StringExample {

	public static void main(String[] args) {
		
		String s = "sun,moon,star@#*";
		
		String temp = "";
		
		for (int i = 0; i < s.length(); i++) {
			String val = ""+ s.charAt(i);
			if( val.equals("@") || val.equals("#") || val.equals("*")) {
			
			}
			else
			{
				temp = temp + s.charAt(i);
			}
		}
		
		System.out.println(temp);
	}
}
