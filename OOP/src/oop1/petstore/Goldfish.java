package oop1.petstore;

public class Goldfish extends Animal implements Pet {

	private String name;
	private Owner owner;
	
	public Goldfish() {
		super(0);
		owner = new Owner("Joe Bloggs");
	}
	
	@Override
	public void eat() {
		System.out.println("Goldfish eat pond scum.");
	}
	
	@Override
	public void walk() {
		super.walk();
		System.out.println("Goldfish, of course, can't walk. They swim.");
	}
	
	@Override
	public void play() {
		System.out.println("Goldfish keep on swimming.");
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	
}
