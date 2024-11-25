package com.test;

public class TestEnthu {
	static int testNumber = testNumberGen(5,6);
	
	{ testNumber = 5; }
	
	

	public static void main(String[] args) throws Exception {
		//System.out.println(B.otherTest());
		//System.out.println(testNumber);
		TestEnthu newTest = new TestEnthu();
		//System.out.println(testNumber);
	}
	
	
	public static int testNumberGen(int a, int b) {
		System.out.println(a*b);
		System.out.println(b);
		return a*b;
	}
	
}
	
	

//	class A {
//		int i;
//		
//		public A(int x) {
//			this.i = x;
//		}
//
//	}
//
//	class B extends A {
//		int j;
//		
//		// public B(int x, int y) { super(x); this.j = y; }
//		B(int x) {
//			super(x);
//		}
//
//		public static int test(int x, int y) {
//			return x + y;
//		}
//
//		public static int otherTest() {
//			int z = 3;
//			return test(z, z);
//		}
//	}

