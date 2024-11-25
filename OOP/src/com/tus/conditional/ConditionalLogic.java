package com.tus.conditional;

import java.util.Scanner;

enum Direction {
	NORTH, SOUTH, EAST, WEST
}
public class ConditionalLogic {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// ConditionalLogic.preAndPostDifference();
		// ConditionalLogic.booleanLogicShortCircuit();
		// ConditionalLogic.booleanBitwiseOps();
		// ConditionalLogic.compareStrings();
//		System.out.print("What is the certification for the film \"Jaws\"? > ");
//		int cert = sc.nextInt();
//		System.out.print("What is the age of the person watching it? > ");
//		int age = sc.nextInt();
//		
//		if (ConditionalLogic.admitToFilm(cert, age)) {
//			System.out.println("Person can watch the film.");
//		}
//		else {
//			System.out.println("Person cannot watch the film.");
//		}

		//ConditionalLogic.ternaryOperator();
		//ConditionalLogic.switchVowelOrConsonant();
		//ConditionalLogic.ifMonth();
		//ConditionalLogic.ifGrade();
		//ConditionalLogic.switchMathOperation();
		//ConditionalLogic.switchEnumType();
		ConditionalLogic.ifTemperature();
			
		

	}

	public static void preAndPostDifference() {
		int x = 5, y = 10;
		System.out.println("The value of x is: " + x);
		System.out.println("The value of ++x is: " + ++x);
		System.out.println("The value of x++ is: " + x++);
		System.out.println("The value of x is: " + x);

		System.out.println("The value of y is: " + y);
		System.out.println("The value of --y is: " + --y);
		System.out.println("The value of y-- is: " + y--);
		System.out.println("The value of y is: " + y);
	}

	public static void booleanLogicShortCircuit() {
		System.out.print("Enter a number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter another number: ");
		int num2 = sc.nextInt();

		if (num1 < 0 && num2++ < 0) {
			System.out.println("num1 < 0 && num2++ < 0");
			System.out.println("Num 2 is: " + num2);
		} else if (num1 > 0 && num2++ > 0) {
			System.out.println("num1 > 0 && num2++ > 0");
			System.out.println("Num 2 is: " + num2);
		} else if (num1 == 0 || num2++ == 0) {
			System.out.println("num1 == 0 || num2++ == 0");
			System.out.println("Num 2 is: " + num2);
		} else if (num1 < 0 || num2++ < 0) {
			System.out.println("num1 < 0 || num2++ < 0");
			System.out.println("Num 2 is: " + num2);
		} else {
			System.out.println("No condition is met.");
			System.out.println("Num 2 is: " + num2);
		}
	}

	public static void booleanBitwiseOps() {
		System.out.print("Enter a number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter another number: ");
		int num2 = sc.nextInt();

		if (num1 < 0 & num2++ < 0) {
			System.out.println("num1 < 0 & num2++ < 0");
			System.out.println("Num 2 is: " + num2);
		} else if (num1 > 0 & num2++ > 0) {
			System.out.println("num1 > 0 & num2++ > 0");
			System.out.println("Num 2 is: " + num2);
		} else if (num1 == 0 | num2++ == 0) {
			System.out.println("num1 == 0 | num2++ == 0");
			System.out.println("Num 2 is: " + num2);
		} else if (num1 < 0 | num2++ < 0) {
			System.out.println("num1 < 0 | num2++ < 0");
			System.out.println("Num 2 is: " + num2);
		} else {
			System.out.println("No condition is met.");
			System.out.println("Num 2 is: " + num2);
		}
	}

	public static void compareStrings() {
		String s1 = "Mary";
		String s2 = "Mary";

		System.out.print("Enter a name: "); // enter "Mary"
		String s3 = sc.next();
		System.out.print("Enter another name: "); // enter "Mary"
		String s4 = sc.next();

		System.out.println(s1 == s2); // s1 and s2 are different objects but this outputs "true" as Strings s1 and s2
										// are assigned to s1 and s2 references in String pool
		System.out.println(s3 == s4); // outputs "false" as Strings s1 and s2 are assigned as different objects when
										// using Scanner class
		System.out.println("Using == returns " + s1 == s2); // outputs "false" as this is comparing [Using == returns
															// Mary == Mary]
		System.out.println("Using == returns " + s1.equals(s2)); // outputs "true" as comparing different values which
																	// are the same and is looking at [s1.equals(s2)] as
																	// a separate expression
		System.out.println("Using == returns " + s3.equals(s4)); // outputs "true" as comparing different values which
																	// are the same and is looking at [s3.equals(s4)] as
																	// a separate expression

		String name3 = "John";
		String name4 = new String("John");
		System.out.println(name3 == name4); // false: explicitly assigning to different objects
		System.out.println(name3.equals(name4)); // true: comparing identical values
	}

	public static boolean admitToFilm(int certification, int age) {

		return (age >= certification) ? true : false;
	}

	public static void ternaryOperator() {
		boolean isHappy = false;
		String mood = isHappy ? "I am happy" : "I am not happy";
		System.out.println("Mood = " + mood);

		System.out.print("Enter value for x: ");
		int x = sc.nextInt();
		System.out.print("Enter value for y: ");
		int y = sc.nextInt();

		int minVal = x < y ? x : y;
		System.out.println("MinVal = " + minVal);
	}

	public static void switchVowelOrConsonant() {
		System.out.print("Enter a letter: > ");
		char letter = sc.next().toLowerCase().charAt(0);

		switch (letter) {
		default: // default can be placed here, it is only executed if no other cases match
			System.out.println("It's a consonant.");
			break;
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("It's a vowel.");
			break;
		}
	}

	public static void ifMonth() {
		final int JAN = 1, FEB = 2, MAR = 3, APR = 4, MAY = 5, JUN = 6,
				JUL = 7, AUG = 8, SEP = 9, OCT = 10, NOV = 11, DEC = 12;
		
		try {
			System.out.print("Enter a month (1 to 12) > ");
			int month = sc.nextInt();
			
			if (month == JAN) {
				System.out.println("January");
			}
			else if (month == FEB) {
				System.out.println("February");
			}
			else if (month == MAR) {
				System.out.println("March");
			}
			else if (month == APR) {
				System.out.println("April");
			}
			else if (month == MAY) {
				System.out.println("May");
			}
			else if (month == JUN) {
				System.out.println("June");
			}
			else {
				System.out.println("Out of range.");
			}
		
		}
		catch (Exception e) {
			System.out.println("Exception caught.");
			e.printStackTrace();
		}
	}

	public static void ifGrade() {
		
		try {
			System.out.print("Enter a mark (0 to 100) > ");
			int grade = sc.nextInt();
			
			if (grade >= 70 && grade <= 100) {
				System.out.println("A");
			}
			else if (grade >= 60 && grade < 70) {
				System.out.println("B");
			}
			else if (grade >= 50 && grade < 60) {
				System.out.println("C");
			}
			else if (grade >= 40 && grade < 50) {
				System.out.println("D");
			}
			else {
				System.out.println("Fail");
			}
		
		}
		catch (Exception e) {
			System.out.println("Exception caught.");
			e.printStackTrace();
		}
	}

	public static void switchMathOperation() {
		double answer = 0.0;
		boolean charOK = true;
		
		System.out.print("Enter a value (Double) > ");
		double num1 = sc.nextDouble();
		System.out.print("Enter a value (Double) > ");
		double num2 = sc.nextDouble();
		
		System.out.print("Enter a character > ");
		char c = sc.next().charAt(0);
		
		switch(c) {
		case '+':
			answer = num1 + num2;
			break;
		case '-':
			answer = num2 - num1;
			break;
		case '*':
			answer = num1 * num2;
			break;
		case '/':
			answer = num1 / num2;
			break;
		default:
			System.out.println("Unknown mathematical operator");
			charOK = false;
			break;
		}
		if (charOK) {
			System.out.println(answer);
		}
	}

	public static void switchEnumType() {
		Direction theWay = null;
		System.out.print("Enter a direction (N, S, E, W) > ");
		String input = sc.next().toLowerCase();
		
		switch(input) {
		case "n":
			theWay = Direction.NORTH;
			break;
		case "s":
			theWay = Direction.SOUTH;
			break;
		case "e":
			theWay = Direction.EAST;
			break;
		case "w":
			theWay = Direction.WEST;
			break;
		default:
			System.out.println("is not recognised.");
			break;
		}
		switch(theWay) {
		case NORTH:
			System.out.println("Santy...");
			break;
		case SOUTH:
			System.out.println("Penguins...");
			break;
		case EAST:
			System.out.println("The land of the rising sun...");
			break;
		case WEST:
			System.out.println("Hollywood...");
			break;
		}
	}

	public static void ifTemperature() {
		
	}
}
