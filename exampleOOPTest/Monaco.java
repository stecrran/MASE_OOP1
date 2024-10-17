package mase.oop1.code.example;

import java.util.ArrayList;


class Billionaire {
	private String name;
	private LeisureCart thePurchase;
	
	Billionaire(String n, LeisureCart p){
		this.name = n;
		this.thePurchase = p;
	}
	
	public LeisureCart getPurchase() {
		return thePurchase;
	}
	
	public String toString() {
		return "Billionaire is named: " + this.name + " and has purchased " + thePurchase.toString();
	}
}

public class Monaco {

	public static void main(String[] args) {
		ArrayList<Billionaire> people = new ArrayList<Billionaire>();
		
		LeisureCart cartJim = new LeisureCart("Ireland", new Saloon(30000));
		people.add(new Billionaire("Jim", cartJim));
	}
	

	public static void processBillionaires(ArrayList<Billionaire> people) {
		for (Billionaire person : people) {
			System.out.println(person + " with LeisureCart " + person.getPurchase());
		}
	}
}
