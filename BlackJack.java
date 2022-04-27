package com.qa.helloworld;

public class BlackJack {

	public static void main(String[] args) {
		System.out.println(blackJack(20, 21));

	}

	public static int blackJack(int num1, int num2) {
		if (num1 > num2 && num1 <= 21 || num1 < num2 && num2 > 21) {
			return num1;
		} else if (num2 >num1 && num2 <= 21 || num2 < num1 && num1 > 21) {
			return num2;
		} else {
			return 0;
		}
	}
}
