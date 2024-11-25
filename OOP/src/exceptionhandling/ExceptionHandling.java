package exceptionhandling;

class A {
	void process() {
		
	}
}

class B extends A {
	
}

public class ExceptionHandling {
	

	public static void main(String[] args) {
		a();
		b();
		c();

	}
	
	public static void a() {
		try {
			
		}
		catch (Exception e) {
			System.out.println("Exception caught.");
		}
		finally {
			System.out.println("Reached finally.");
		}
	}
	
	public static void b() {
		try {
			return;
		}
		catch (Exception e) {
			System.out.println("Exception caught.");
		}
		finally {
			System.out.println("Reached finally.");
		}
	}
	
	public static void c() {
		try {
			throw new Exception();
		}
		catch (Exception e) {
			System.out.println("Exception caught: " + e.toString());
			return;
		}
		finally {
			System.out.println("Reached finally.");
		}
	}

}

