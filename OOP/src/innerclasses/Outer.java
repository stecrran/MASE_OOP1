package innerclasses;

public class Outer {
	
	private int privateOuterData = 20;
	
	class Inner {
		
		private int privateInnerData = 10;
		
		private void innerDisplay() {
			System.out.println("privateOuterData: " + privateOuterData);
		}
		
	}
	
	private void outerDisplay() {
		System.out.println("privateInnerData: " + new Inner().privateInnerData);
	}

	public static void main(String[] args) {
		Outer testOuter = new Outer();
		testOuter.outerDisplay();
		
		// Inner testInner = new Outer().new Inner(); // correct
		Outer.Inner testInner = testOuter.new Inner(); // also correct
		testInner.innerDisplay();
		
		
		
	}
	

	

}

class Inner {
	
	private int privateInnerData;
	
	private void innerDisplay() {
		System.out.println("privateOuterData");
	}
	
}
