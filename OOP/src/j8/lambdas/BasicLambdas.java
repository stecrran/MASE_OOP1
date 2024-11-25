package j8.lambdas;

import java.util.function.Predicate;

public class BasicLambdas {
	public static void main(String[] args) {
		BasicLambdas bl = new BasicLambdas();
		bl.predicate();
		boolean b1 = check(4, (n -> n % 2 == 0));
		boolean b2 = check(7, (n -> n % 2 == 0));
		System.out.println("Check (4): " + b1);
		System.out.println("Check (7): " + b2);
		
		boolean b3 = check("Mr. Joe Bloggs", (s -> s.startsWith("Mr.")));
		boolean b4 = check("Ms. Joe Bloggs", (s -> s.startsWith("Mr.")));
		System.out.println("Check (Mr.): " + b3);
		System.out.println("Check (Mr.): " + b4);
	}
	
	// you have to add "<T>" in the method signature
	public static <T> boolean check(T t, Predicate<T> lambda) {
		return lambda.test(t);
	}
	
	public void predicate() {
		Evaluate<Integer> anonInnerRef = new Evaluate<Integer>() {
			// before Java 8 
			// this is anonymous inner class code - There will be questions on inner classes
			@Override
			public boolean checkIfNegative(Integer i) {
				return i < 0;
			}
		};
		System.out.println("Anon: " + anonInnerRef.checkIfNegative(-1));
		System.out.println("Anon: " + anonInnerRef.checkIfNegative(1));

		
		// Java 8 - Lambda expression depends upon a Functional interface
		//Evaluate<Integer> lambda = (Integer i) -> {return i < 0;}; // test this, does this work the same as below?
		Evaluate<Integer> lambda = i -> i < 0;
		System.out.println("Java 8: " + lambda.checkIfNegative(-1));
		System.out.println("Java 8: " + lambda.checkIfNegative(1));
		
		// Java 8 - Predicate interface
		Predicate<Integer> predicate = i ->  i < 0;
		System.out.println("Java 8 Predicate: " + predicate.test(-1));
		System.out.println("Java 8 Predicate: " + predicate.test(1));

	}
}
