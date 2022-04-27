package com.qa.helloworld;

public class StringManipulation {

	public static void main(String[] args) {

		String myStr = "I like strings";
		// specificed below that you want a new object
		String myStr2 = new String("I like strings");
		String myStr3 = "I like strings";

		// when this is called it points to the same object in memory
		System.out.println(myStr == myStr3);
		// here it doesn't point to the same object in memory to reference so returns
		// false
		System.out.println(myStr == myStr2);
		// below you can compare the values and not the memory reference
		System.out.println(myStr.equals(myStr2));

		for (int i = 0; i < myStr.length(); i++) {
			System.out.println(myStr.charAt(i));
		}
		
		String str1 = "ThisIsSoMeText";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		String str2 = str1.toUpperCase();
		System.out.println(str1.charAt(2));
		System.out.println(str1.indexOf("i"));
		System.out.println(str1.startsWith("t"));
		System.out.println(str1.endsWith("t"));
		System.out.println(str1.contains("hi"));
		System.out.println(str1.substring(1, 7));
		System.out.println(str2);
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.replace("This", "IsThis"));
		
		
	}

}
