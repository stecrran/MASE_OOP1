package mase.oop1.code.example;

public abstract class Boat implements Machine {
	protected double thePrice;
	
	public Boat(double price) {
		price = thePrice;
	}
	
	public Double getPrice() {
		return this.thePrice;
	}
	
	public String toString() {
		return "";
	}
	
}


class Yacht extends Boat implements Desirable {

	public Yacht(double price) {
		super(price);
	}
	
	public void start() {
		
	}
	
	public void stop() {
		
	}
	
}
class Canoe extends Boat {

	public Canoe(double price) {
		super(price);
	}
		
	public void start() {
			
	}
		
	public void stop() {
			
	}
	
}


class Kayak extends Boat {

	public Kayak(double price) {
		super(price);
	}
		
	public void start() {
			
	}
		
	public void stop() {
			
	}
	
}

