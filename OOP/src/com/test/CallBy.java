package com.test;

public class CallBy {

	public static void main(String[] args) {
//		String name = "Sean";
//		String originalName = name;
//		
//		name += " Kennedy";
//		System.out.println(name);
//		System.out.println(originalName);

//		String pet = "dog";
//		System.out.println(immutableString(pet));
//		pet = immutableString(pet);
//		System.out.println(pet);
//		
        Flyer f = new Eagle();
        Eagle e = new Eagle();
        Bat b = new Bat();
        
        if(f instanceof Flyer) System.out.println("f is a Flyer");
        if(e instanceof Bird) System.out.println("e is a Bird");
        if(b instanceof Bird) System.out.println("b is a Bird");

	}

	public static String immutableString(String petAlias) {
		petAlias += " named Spot";
		return petAlias;
	}

}



interface Flyer{ }
class Bird implements Flyer { }
class Eagle extends Bird { }
class Bat { }



    



