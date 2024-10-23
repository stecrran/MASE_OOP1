package oop1.shop;

public abstract class Television implements ElectronicDevice{
	private String theMake;
	private String theModel;
	
	public Television(String aMake, String aModel) {
		theMake = aMake;
		theModel = aModel;
	}
	
	@Override
	public String getTheMake() {
		return theMake;
	}
	
	@Override
	public String getTheModel() {
		return theModel;
	}
	
	@Override
	public String toString() {
		return "Television: " + getTheMake() + getTheModel();
	}
	
	
}


class Plasma extends Television implements HighlyDesirable{
	Plasma(String aMake, String aModel) {
		super(aMake, aModel);
	}
	
	public void turnOn() {
		System.out.println("Plasma::turnOn()");
	}
	
	public void turnOff() {
		System.out.println("Plasma::turnOff()");
	}
}

class LED extends Television{
	LED(String aMake, String aModel) {
		super(aMake, aModel);
	}
	
	public void turnOn() {
		System.out.println("LED::turnOn()");
	}
	
	public void turnOff() {
		System.out.println("LED::turnOff()");
	}
}
