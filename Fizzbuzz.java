package com.qa.helloworld;

public class Fizzbuzz {

	public static void main(String[] args) {
		

	}
	
	public static void main (int num) {
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("Fizzbuzz");
		} else if (num % 3 == 0) {
			System.out.println("Fizz");
		} else if (num % 5 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println(num);
		}
	}

}
