package com.test;

public class Lambdas implements Printable {

	public static void main(String[] args) {

		Printable lambdaPrintable = (s) -> "Meow" + s;

		printThing(lambdaPrintable);
	}

	static void printThing(Printable thing) {
		System.out.println(thing.print("!"));
	}
	
	@Override
	public String print(String suffix) {
		return suffix;
	}
	
}
