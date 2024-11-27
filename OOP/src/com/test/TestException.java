package com.test;

public class TestException {

	public static void main(String[] args) {
		
		String j = "0";

//		try {
//			int i = doIt() / (j = 2);
//		}
//		catch (Exception e) {
//			System.out.println(" j = " + j);
//		}
//		System.out.println((float)k/(k=2));
		TestException test = new TestException();
//		test.m2();
		
		System.out.println(test.parseFloat(j));
		

	}
	
	public static int doIt() throws Exception {
		throw new Exception("Forget it.");
	}
	
	Object m1() {
		return new Object();
	}
	
	void m2() {
		Object s = (String) m1();
	}
	
	public float parseFloat(String s) {
		float f = 0.0f;
		try {
			String j = String.valueOf("1k");
			float k = Float.parseFloat(j);
			f = Float.valueOf(s).floatValue();
			System.out.println("No Exception");

			return f;
		}
		catch (NumberFormatException nfe) {
			f = Float.NaN;
			System.out.println("Caught NumberFormatException");
			return f;
		}
	}

}
