package com.tus.loops;

import java.util.Scanner;

public class LoopExercises {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// LoopExercises.whileLoop1();
		// LoopExercises.whileLoop2();
		LoopExercises.whileLoop3();

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
//	
//	public static void doWhileLoop1() {
//		
//	}
//	
//	public static void doWhileLoop2() {
//		
//	}
//	
//	public static void doWhileLoop3() {
//		
//	}
//	
//	public static void forLoop1() {
//		
//	}
//	
//	public static void forLoop2() {
//		
//	}
//	
//	public static void forLoop3() {
//		
//	}
//	
//	public static void histogram() {
//		
//	}

}
