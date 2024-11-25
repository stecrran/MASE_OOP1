package com.tus.methods;

import java.util.Scanner;

public class MethodExercises {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter x: ");
		int x = sc.nextInt();
		System.out.print("Enter y: ");
		int y = sc.nextInt();
		
		System.out.println("The sum of " + x + " and " + y + " is " + calculateSum(x, y));
		System.out.println("The product of " + x + " and " + y + " is " + calculateProduct(x, y));
		System.out.println("The difference of " + x + " and " + y + " is " + calculateDifference(x, y));
		System.out.println("The quotient of " + x + " and " + y + " is " + calculateQuotient(x, y));

	}
	
	public static int calculateSum(int x, int y) {
		return x + y;
	}
	
	public static int calculateProduct(int x, int y) {
		return x * y;
	}
	
	public static int calculateDifference(int x, int y) {
		return x - y;
	}
	
	public static int calculateQuotient(int x, int y) {
		return x / y;
	}

}
