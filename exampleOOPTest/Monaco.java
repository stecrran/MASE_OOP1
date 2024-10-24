package mase.oop1.code.example;

import java.util.ArrayList;

class Billionaire {
	private String name;
	private LeisureCart thePurchase;

	Billionaire(String aName, LeisureCart aPurchase) {
		this.name = aName;
		this.thePurchase = aPurchase;
	}

	public LeisureCart getPurchase() {
		return thePurchase;
	}

	@Override
	public String toString() {
		return (this.name + "purchased: " + thePurchase.toString());
	}
}

public class Monaco {

	public static void main(String[] args) {
		try {
			ArrayList<Billionaire> people = new ArrayList<Billionaire>();

			LeisureCart bigYacht = LeisureCart.createNewInstance("Monaco", new Yacht(250000000.00));
			Billionaire SHammad = new Billionaire("Sheikh Hammad ", bigYacht);
			people.add(SHammad);

			LeisureCart smallSaloon = LeisureCart.createNewInstance("Ireland", new Saloon(20000.00));
			Billionaire JPMcManus = new Billionaire("JP McManus ", smallSaloon);
			people.add(JPMcManus);

			Monaco.processBillionaires(people);
		} catch (Exception e) {
			System.out.println("Error encountered.");
		}
	}

	public static void processBillionaires(ArrayList<Billionaire> people) {
		for (Billionaire person : people) {
			System.out.print(person);
			if (person.getPurchase().getMachine() instanceof Desirable) {
				System.out.println(" - Desirable Item");
			}
			if (person.getPurchase().getMachine() instanceof Car) {
				Car car = (Car) person.getPurchase().getMachine(); // cast to Car object as Billionaire has no isPractical() method
				if (car.isPractical()) {
					System.out.println(" - Practical car");
				}
				else {
					System.out.println(" - Not a practical car");
				}
			}
			System.out.println();
		}
	}
}
