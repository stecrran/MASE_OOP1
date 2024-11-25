package com.test;

public class A {
	
	int i;
	
	A(int i){
		this.i = i;
	}
	
	public void setA(int i) {
		this.i = i;
	}
	
	public int getA() {
		return i;
	}
	
	@Override
	public String toString() {
		return "A = " + getA();
	}

	public static void main(String[] args) {
		A a = new A(1);
		System.out.println(a.toString());
		
		//A b = (B) new A(2); // ClassCastException A cannot be B
		//System.out.println(b.toString()); 

	}
	
}
	class B extends A{
		
		B(int i){
			super(i);

		}
	}


