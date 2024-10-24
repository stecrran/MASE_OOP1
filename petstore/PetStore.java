package oop1.petstore;

public class PetStore {

	public static void main(String[] args) {
		Lizard l = new Lizard();
		l.eat();
		l.walk();
		
		Animal a =  new Lizard();
		a.eat();
		a.walk();
		
		Dog d = new Dog("Spot");
		d.eat();
		d.walk();
		d.play();
		
		a = new Dog();
		a.eat();
		a.walk();
		
		Pet p = new Dog();
		
		p.setName("Brownie");
		p.play();
		
		Goldfish g = new Goldfish(); 
		g.setName("Nemo");
		g.eat();
		g.walk();
		g.play();
		
		Dog rex = new Dog("Rex");
		playWithAnimals(rex);
		
		playWithAnimals(new Goldfish());
		
		playWithAnimals(new Lizard());
	}
	
	public static void playWithAnimals(Animal animal) {
		animal.eat();
		if (animal instanceof Pet) {
			Pet pet = (Pet) animal;
			pet.play();
		}
	}
	
}
