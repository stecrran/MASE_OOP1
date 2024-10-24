package mase.oop1.code.example;

public abstract class Boat implements Machine {
	
	protected double thePrice;
	
	public Boat(double price) {
		thePrice = price;
	}
	
	@Override
	public Double getPrice() {
		return this.thePrice;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
	
}


class Yacht extends Boat implements Desirable {

	public Yacht(double price) {
		super(price);
	}
	
	@Override
	public void start() {
		System.out.println("Yacht::start");
	}
	
	@Override
	public void stop() {
		System.out.println("Yacht::stop");
	}
	
}
class Canoe extends Boat {

	public Canoe(double price) {
		super(price);
	}
	
	@Override
	public void start() {
		System.out.println("Canoe::start");
	}
		
	@Override
	public void stop() {
		System.out.println("Canoe::stop");
	}
	
}


class Kayak extends Boat {

	public Kayak(double price) {
		super(price);
	}
		
	@Override
	public void start() {
		System.out.println("Kayak::start");	
	}
		
	@Override
	public void stop() {
		System.out.println("Kayak::stop");
	}
	
}

