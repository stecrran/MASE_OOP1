package oop1.petstore;

public class Dog extends Animal implements Pet {

	private String name;
	private Owner owner;
	
	public Dog() {
		this("Fluffy");
	}
	
	public Dog(String name) {
		super(4);
		this.name = name;
		owner = new Owner("Joe Bloggs");
	}
	

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println("This animal likes to eat meat.");
	}
	
	@Override
	public void walk() {
		System.out.println("This animal walks on " + legs + " legs.");
	}
	
	@Override
	public void play() {
		System.out.println(name + " likes to chase cats.");
	}
}
