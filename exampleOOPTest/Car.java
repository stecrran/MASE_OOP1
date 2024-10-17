package mase.oop1.code.example;

public abstract class Car implements Machine {
	protected double thePrice;

	public Car(double price) {
		thePrice = price;
	}

	@Override
	public Double getPrice() {
		return thePrice;
	}

	@Override
	public String toString() {
		return "";
	}

	public abstract boolean isPractical();
}


class Saloon extends Car {

	Saloon(double price) {
		super(price);
	}

	@Override
	public void start() {

	}

	@Override
	public void stop() {

	}

	@Override
	public boolean isPractical() {
		return false;
	}
}


class Hatchback extends Car {

	public Hatchback(double price) {
		super(price);
	}

	@Override
	public void start() {

	}

	@Override
	public void stop() {

	}

	@Override
	public boolean isPractical() {
		return false;
	}
}

class Convertible extends Car implements Desirable {

	public Convertible(double price) {
		super(price);
	}

	@Override
	public void start() {
		
	}

	@Override
	public void stop() {

	}

	@Override
	public boolean isPractical() {
		return false;
	}

	}

