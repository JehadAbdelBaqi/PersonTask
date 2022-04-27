package com.qa.helloworld;

public class StringManipulationProject {

	public static void main(String[] args) {
		String sentence1 = "Hello my name is Jehad.";
		System.out.println(returnWords(sentence1));

	}

	public static int returnWords(String sentence) {
		int wordCount = 0;
		char space = ' ';

		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == space) {
				wordCount++;
			}
		}
		wordCount++;
		return wordCount++;
	}
}
