package FarmerTest;

import enums.Farmer;

public class TestEnum {

	public static void main(String[] args) {
//		Farmer[] allValues = Farmer.values();
//		for (Farmer value : Farmer.values()) {
//			System.out.println(value.name() + " Farmer has "+ value.getNumAcres() + " acres.");
//		}
		double dairyGrant = calculateGrant(Farmer.DAIRY);
		double beefGrant = calculateGrant(Farmer.BEEF);
		double sheepGrant = calculateGrant(Farmer.SHEEP);
		
		System.out.println(dairyGrant);
		System.out.println(beefGrant);
		System.out.println(sheepGrant);
		enums();
		
	}
	
	public static void enums() {
		Farmer john = Farmer.BEEF;
		john.setNumAcres(500);
		double grant = calculateGrant(john);
		
		System.out.println("John is a " + john + " and has " + john.getNumAcres() + " acres.");
		System.out.println("John's grant is " + grant);
	}
	
	public static double calculateGrant(Farmer farmer) {
		double grant = 0.0;
		switch(farmer) {
		case DAIRY:
			grant = farmer.getNumAcres() < 300 ? 300*farmer.getNumAcres() : 80*farmer.getNumAcres();
			break;
		case BEEF:
			grant = farmer.getNumAcres() < 200 ? 200*farmer.getNumAcres() : 50*farmer.getNumAcres();
			break;
		case SHEEP:
			grant = farmer.getNumAcres() < 200 ? 150*farmer.getNumAcres() : 40*farmer.getNumAcres();
			break;
		default:
			break;
		}
		return grant;
	}
	
}


