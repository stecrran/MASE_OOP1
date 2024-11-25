package a;

public class A {
	public int a = 1;
	
	public int getA() {
		return this.a;
	}
	

}

class A1 {
	public void test() {
		A ref = new A();
		ref.a = 8;
	}
}

