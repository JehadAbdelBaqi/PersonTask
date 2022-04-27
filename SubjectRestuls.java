package com.qa.helloworld;

public class SubjectRestuls {

	static String subject_one = "Physics";
	static String subject_two = "Chemistry";
	static String subject_three = "Math";
	static int subject_one_result = 149;
	static int subject_two_result = 110;
	static int subject_three_result = 116;
	static int max_total = 150;

	public static void main(String[] args) {
		returnResults(subject_one, subject_two, subject_three, subject_one_result, subject_two_result,
				subject_three_result, max_total, getSinglePercentage(subject_one_result),
				getSinglePercentage(subject_two_result), getSinglePercentage(subject_three_result),
				getPercentage(subject_one_result, subject_two_result, subject_three_result));

//		returnResults("CompSci", "Science", "English", 100, 43, 75, 150);

		System.out.println(getPercentage(100, 120, 130));
//		System.out.println(String.format("%.2f", getPercentage(100, 120, 130)));

		System.out.println(String.format("%.2f", getSinglePercentage(subject_one_result)));
		System.out.println(String.format("%.2f", getSinglePercentage(subject_two_result)));
		System.out.println(String.format("%.2f", getSinglePercentage(subject_three_result)));
	}

	public static void returnResults(String subject_one, String subject_two, String subject_three, int result_one,
			int result_two, int result_three, int total, double perc_one, double perc_two, double perc_three,
			double total_perc) {

		int student_total = result_one + result_two + result_three;
		int max_total = total * 3;
		int failed_subjects = 0;

		if (getSinglePercentage(result_one) < 60) {
			failed_subjects++;
		}
		if (getSinglePercentage(result_two) < 60) {
			failed_subjects++;
		}
		if (getSinglePercentage(result_three) < 60) {
			failed_subjects++;
		}

		System.out.println("You scored " + result_one + " out of " + total + " in your " + subject_one
				+ " exam. This is " + String.format("%.2f", perc_one) + "% out of 100%");
		System.out.println("You scored " + result_two + " out of " + total + " in your " + subject_two
				+ " exam. This is " + String.format("%.2f", perc_two) + "% out of 100%");
		System.out.println("You scored " + result_three + " out of " + total + " in your " + subject_three
				+ " exam. This is " + String.format("%.2f", perc_three) + "% out of 100%");
		System.out.println("Your total score is " + student_total + " out of a maximum of " + max_total
				+ ". This is a total " + total_perc + " out of 100%\n");

		if (getSinglePercentage(result_one) < 60 || getSinglePercentage(result_two) < 60
				|| getSinglePercentage(result_three) < 60) {
			System.out.println("You scored less than 60% in " + failed_subjects
					+ " of your exam(s) - you are a failure in life\n");
		} else {
			System.out.println("Well done for not being a loser\n");
		}
	}

	public static int getPercentage(int result_one, int result_two, int result_three) {
		int total = result_one + result_two + result_three;
		int max = 450;
		int percentage_calc = total * 100 / max;

		return percentage_calc;
	}

	public static double getSinglePercentage(double result_one) {
		double max = 150;
		double result_one_perc = result_one * 100 / max;

		return result_one_perc;
	}

}
