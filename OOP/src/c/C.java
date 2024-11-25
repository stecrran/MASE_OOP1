package c;

import a.A;
import b.B;

public class C extends B {
	
	public static void main(String[] args) {
		A a = new A();
		a.a = 2;
		System.out.println(a.getA());
	}
	
	public void accessField() {
		//a = 2; // okay unless int a in A() is given 'public' access. There is no lookup for public declarations so it is not inherited
		
		A ref = new A(); // okay once you import a.A
		
		ref.a = 8; 	// 'int a' in A() is protected so not visible in this package (c) 
					// If you take away "protected", still not visible as it's package private
	}
}
