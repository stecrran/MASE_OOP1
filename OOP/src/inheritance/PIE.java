package inheritance;

public class PIE {

	public static void main(String[] args) {
		Human h = new Human();
		System.out.println(h);
		h = new Male();
		System.out.println(h);
		h = new Female();
		System.out.println(h);
		h = new Boy();
		System.out.println(h);
		
		//Male m = (Male)new Human();
		Boy b = new Boy();
		System.out.println(b.show());
		doSomething(new Human());
		doSomething(new Male());
		doSomething(new Female());
		doSomething(new Boy());
		doSomething(new Girl());
		doSomething(new Man());
		doSomething(new Women());

	}
	
	public static void doSomething(Human h) {
		System.out.println(h.whoAmI());
	}

}
