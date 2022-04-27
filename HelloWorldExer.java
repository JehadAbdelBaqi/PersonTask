package com.qa.helloworld;

public class HelloWorldExer {

	public static void main(String[] args) {
		String str1 = "Hello, world.";
		System.out.println("Hello, world");
		System.out.println(str1);
		System.out.println(outputString("HELLO"));
		System.out.println(outputString(str1));
	}
	
	public static String outputString(String word) {
		return word;
	}

}
