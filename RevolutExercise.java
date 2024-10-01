package com.tus.loops;

import java.util.Scanner;

public class RevolutExercise {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double[] euro = { 4.66, 22.96, 113.90, 461.53, 462.84, 4888.79, 3949.74, 3930.97 };
		double[] dollar = { 5.00, 25.00, 124.00, 500.00, 500.00, 5300.00, 4300.00, 4300.00 };

		double total = 0.0;
		for (double euro_value : euro) {
			total = total + euro_value;
		}
		System.out.println("Total invested is " + total + " EUR");

//		System.out.print("Enter the current value (EUR): ");
//		double value = sc.nextDouble();
//
//		System.out.println("Difference is " + Math.round(value - total) + " EUR");

		total = 0.0;
		for (double dollar_value : dollar) {
			total = total + dollar_value;
		}
		System.out.println("Total value is " + total + " $");

		for (int i = 0; i < euro.length; i++) {
			System.out.println("Exchange rate " + i + " (dollars per EUR) = " + (dollar[i] / euro[i]));
		}

	}
}
