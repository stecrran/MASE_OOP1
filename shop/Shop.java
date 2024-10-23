package oop1.shop;

import java.util.ArrayList;

public class Shop {

	public static void main(String[] args) {
		ArrayList<ElectronicDevice> devices = new ArrayList<>();
		Plasma SonyPlasma = new Plasma("Sony", "P300");
		devices.add(SonyPlasma);
		
		Laptop DellLaptop = new Laptop("Dell", "Inspiron");
		devices.add(DellLaptop);
		
		Shop.processDevices(devices);
	}
	
	public static void processDevices(ArrayList<ElectronicDevice> devices) {
		for (ElectronicDevice device : devices) {
			System.out.print(device.getTheMake() + " " + device.getTheModel());
			if (device instanceof HighlyDesirable) {
				System.out.println(" - Highly Desirable Item");
			}
			System.out.println();
		}
	}
}
