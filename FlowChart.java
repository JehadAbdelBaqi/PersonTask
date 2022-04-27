package com.qa.helloworld;

public class FlowChart {

	public static void main(String[] args) {
		flowChart(7000);
	}

	public static void flowChart(int a) {

		if (a > 2000) {
			System.out.println("A");
			if (a > 6000) {
				System.out.println("C");
				System.out.println("End");
			} else if (a < 6000) {
				System.out.println("B");
				if (a > 4000) {
					System.out.println("D");
					System.out.println("End");
				} else {
					System.out.println("E");
					System.out.println("End");
				}
			}
		} else if (a < 2000) {
			System.out.println("1");
			if (a > 100) {
				System.out.println("3");
				if (a > 600) {
					System.out.println("5");
					System.out.println("End");
				} else if (a < 600) {
					System.out.println("4");
					if (a > 500) {
						System.out.println("6");
						System.out.println("End");
						} else {
							System.out.println("7");
							System.out.println("End");
					}
				}
			} else if (a < 100) {
				System.out.println("2");
				System.out.println("End");
			}
		}

	}

}
