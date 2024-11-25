package j8.lambdas;

public interface Evaluate<T> { // Functional interface
	// interface is public abstract by default
	boolean checkIfNegative(T t); // functional method
		
}
