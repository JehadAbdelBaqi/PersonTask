package com.qa.helloworld;

public class ArrayExercise {

	static int[] numbersArray = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
	static int[] emptyArray = new int[6];
	static String[] nameArray = { "Jehad", "Alex", "Ben", "Emma", "Sean" };

	public static void main(String[] args) {
//		arrayLooper(numbersArray);
//		arrayLooper(emptyArray);
//		arrayPopulator(numbersArray);
//		arrayPopulator(emptyArray);
//		stringLooper(nameArray);
//		System.out.println(checkNumber(87));
		cubedOrSquared(numbersArray);

	}

	public static void arrayLooper(int[] listToIterate) {
		for (int a : listToIterate) {
			System.out.println(a);
		}
		
	}

	public static boolean checkNumber(int number) {
		if (number % 2 ==0) {
			return true;
		} else {
			return false;
		}
	}

	public static void arrayPopulator(int[] listToPopulate) {
		for (int i = 0; i < listToPopulate.length; i++) {
			listToPopulate[i] = i * i;
			System.out.println(listToPopulate[i]);

		}
	}

	public static void stringLooper(String[] listToIterate) {
		for (String name : listToIterate) {
			System.out.println(name);
		}
	}
	
	public static void cubedOrSquared(int[] listToIterate) {
		for (int i : listToIterate) {
			if (i % 2 == 0) {
				System.out.println(i * i);
			} else {
				System.out.println(i * i * i);
			}
		}
	}
}
