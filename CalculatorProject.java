package com.qa.helloworld;

public class CalculatorProject {

	public static void main(String[] args) {

		division(7, 5);
		System.out.println(subtract(5, 1));
		System.out.println(multiply(4, 4));
	}

	public static double add(double num1, double num2) {
		return num1 + num2;
	}

	private static double subtract(double num1, double num2) {
		return num1 - num2;
	}

	private static double multiply(double num1, double num2) {
		return num1 * num2;
	}

	public static void division(double num_one, double num_two) {

		String message = "The division cannot be performed";

		if (num_two > num_one) {
			System.out.println(message);
			;
		} else {
			System.out.println(num_one / num_two);
		}
	}
}