package com.tus.loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoopExercises {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// LoopExercises.whileLoop1();
		// LoopExercises.whileLoop2();
		// LoopExercises.whileLoop3();
		// LoopExercises.doWhileLoop3();
		// LoopExercises.forLoop1();
		// LoopExercises.forLoop2();
		// LoopExercises.forLoop3();
		// LoopExercises.histogram();

	}

	public static void whileLoop1() {
		int i = 1;
		int n = 5;
		int total = 0;

		while (i <= n) {
			System.out.println("Loop 1: i == " + i);
			total += i;
			i++;
		}

		System.out.println("Loop 1: Total == " + total);

		try {
			System.out.print("\nEnter increment amount > ");
			int amount = sc.nextInt();

			i = 1;
			n = 5;
			total = 0;

			while (i <= n) {
				System.out.println("Loop 1: i == " + i);
				total = total + (i + amount);
				i = i + amount;
			}
			System.out.println("Loop 1: Total == " + total);
		} catch (Exception e) {
			System.out.println("Invalid. Enter a number.");
		}
	}

	public static void whileLoop2() {
		int i = 5;
		int n = 1;
		int total = 0;

		while (i >= n) {
			System.out.println("Loop 1: i == " + i);
			total += i;
			i--;
		}

		System.out.println("Loop 1: Total == " + total);

		try {
			System.out.print("\nEnter increment amount > ");
			int amount = sc.nextInt();

			i = 5;
			n = 1;
			total = 0;

			while (i >= n) {
				System.out.println("Loop 1: i == " + i);
				i = i - amount;
				total = total + (i + amount);
			}
			System.out.println("Loop 1: Total == " + total);
		} catch (Exception e) {
			System.out.println("Invalid. Enter a number.");
		}
	}

	public static void whileLoop3() {

		int total = 0;
		int n = 0;

		while (n >= 0) {
			try {
				total += n;
				System.out.print("Enter a number: > ");
				n = sc.nextInt();

			} catch (Exception e) {
				System.out.println("Error. Invalid input.");
				break;
			}
		}
		System.out.println("Total is: " + total);
	}

	public static void doWhileLoop3() {
		int number = 0;
		int total = 0;
		try {
			do {
				total += number;
				System.out.print("Enter a number (-1 to exit) --> ");
				number = sc.nextInt();
			} while (number != -1);
			System.out.println("Sum is " + total);
		} catch (InputMismatchException e) {
			System.out.println("Invalid entry.");
		}
	}

	public static void forLoop1() {
		int total1 = 0;
		for (int i = 0; i <= 20; i++) {
			total1 += i;
		}
		System.out.println("Total is " + total1);

		int total2 = 0;
		for (int j = 0; j <= 20; j = j + 5) {
			total2 += j;
		}
		System.out.println("Total is " + total2);
	}

	public static void forLoop2() {
		int total1 = 0;
		for (int i = 40; i >= 30; i--) {
			total1 += i;
		}
		System.out.println("Total is " + total1);

		int total2 = 0;
		for (int j = 40; j >= 30; j -= 5) {
			total2 += j;
		}
		System.out.println("Total is " + total2);
	}

	public static void forLoop3() {
		int number = 0;
		int total = 0;
		try {
			for (int i = 0;; i++) {
				total += number;
				System.out.print("Enter a number > ");
				number = sc.nextInt();

				if (number == -1) {
					break;
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid entry.");
		}
		System.out.println("Total is " + total);
	}

	public static void histogram() {
		System.out.println("Using for loops:");
		try {
			System.out.print("Enter number of rows --> ");
			int rows = sc.nextInt();

			System.out.print("Enter number of columns --> ");
			int cols = sc.nextInt();

			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					System.out.print('*');
				}
				System.out.println();
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid entry. Must be number.");
		}
		System.out.println("Using do-while loops:");
		try {
			System.out.print("Enter number of rows --> ");
			int rows = sc.nextInt();
			int i = 0;
			System.out.print("Enter number of columns --> ");
			int cols = sc.nextInt();

			do {
				int j = 0;
				do {
					System.out.print('*');
					j++;
				} while (j < cols);
				System.out.println();
				i++;
			} while (i < rows);

		} catch (InputMismatchException e) {
			System.out.println("Invalid entry. Must be number.");
		}
		System.out.println("Using while loops:");
		System.out.print("Enter number of rows --> ");
		int rows = sc.nextInt();
		int i = 0;
		System.out.print("Enter number of columns --> ");
		int cols = sc.nextInt();
		int j = 0;
		try {
			while (i < rows) {
				j = 0;
				while (j < cols) {
					System.out.print('*');
					j++;
				}
				System.out.println();
				i++;
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid entry. Must be number.");
		}
	}
}
