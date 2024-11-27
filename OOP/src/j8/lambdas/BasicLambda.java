package j8.lambdas;

import java.util.function.Predicate;

public class BasicLambda {

	public static void main(String[] args) {
		BasicLambda bl = new BasicLambda();
		bl.predicate();
		System.out.println(bl.check(4, (t -> t % 2 == 0)));
		System.out.println(bl.check(7, (t -> t % 2 == 0)));
		System.out.println(bl.check("Mr. Joe Bloggs", (str -> str.startsWith("Mr."))));
		System.out.println(bl.check("Ms. Joe Bloggs", (str -> str.startsWith("Mr."))));
		
	}
	
	public void predicate() {
		Evaluate<Integer> lambda = i -> i < 0;
		System.out.println("Is 1" + " negative? - " + lambda.checkIfNegative(1));
		System.out.println(lambda.checkIfNegative(-1));
		
		Predicate<Integer> predicate = i -> i < 0;
		System.out.println(predicate.test(1));
		System.out.println(predicate.test(-1));
	}
	
	public static <T> boolean check(T t, Predicate<T> lambda) {
		return lambda.test(t);
	}
	

}
