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
		return this.getClass().getSimpleName();
	}

	public abstract boolean isPractical();
}

class Saloon extends Car {

	Saloon(double price) {
		super(price);
	}

	@Override
	public void start() {
		System.out.println("Saloon::start()");
	}

	@Override
	public void stop() {
		System.out.println("Saloon::stop()");
	}

	@Override
	public boolean isPractical() {
		return true;
	}
}

class Hatchback extends Car {

	public Hatchback(double price) {
		super(price);
	}

	@Override
	public void start() {
		System.out.println("Hatchback::start()");
	}

	@Override
	public void stop() {
		System.out.println("Hatchback::stop()");
	}

	@Override
	public boolean isPractical() {
		return true;
	}
}

class Convertible extends Car implements Desirable {

	public Convertible(double price) {
		super(price);
	}

	@Override
	public void start() {
		System.out.println("Covertible::start()");
	}

	@Override
	public void stop() {
		System.out.println("Covertible::stop()");
	}

	@Override
	public boolean isPractical() {
		return false;
	}

}
