package mase.oop1.code.example;

import java.sql.Date;

public class LeisureCart {

	private final String location;

	private final Machine machine;
	
	// UML marks this as "Public"
	LeisureCart(String location,  Machine aMachine) {
		this.location = location;
		
		if (aMachine instanceof Saloon) {
			this.machine = new Saloon(aMachine.getPrice());
		} 
		else if (aMachine instanceof Hatchback) {
			this.machine = new Hatchback(aMachine.getPrice());
		} 
		else if (aMachine instanceof Convertible) {
			this.machine = new Convertible(aMachine.getPrice());
		} 
		else if (aMachine instanceof Yacht) {
			this.machine = new Yacht(aMachine.getPrice());
		} 
		else if (aMachine instanceof Canoe) {
			this.machine = new Canoe(aMachine.getPrice());
		} 
		else if (aMachine instanceof Kayak) {
			this.machine = new Kayak(aMachine.getPrice());
		} 
		else {
			this.machine = null;
		}

	}
	
	
	public String getLocation() {
		return this.location;
	}
	
	
	public Machine getMachine() {
		if (machine instanceof Saloon) {
			return new Saloon(machine.getPrice());
		} 
		else if (machine instanceof Hatchback) {
			return new Hatchback(machine.getPrice());
		} 
		else if (machine instanceof Convertible) {
			return new Convertible(machine.getPrice());
		} 
		else if (machine instanceof Yacht) {
			return new Yacht(machine.getPrice());
		} 
		else if (machine instanceof Canoe) {
			return new Canoe(machine.getPrice());
		} 
		else if (machine instanceof Kayak) {
			return new Kayak(machine.getPrice());
		} 
		else {
			return null;
		}
	}
	
	public String toString() {
		return "";
	}
	
}