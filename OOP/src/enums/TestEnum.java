package enums;

public class TestEnum {

	public static void main(String[] args) {
		enums();

	}

	public static void enums() {
		Farmer john = Farmer.BEEF;
		john.setNumAcres(500);
		System.out.println(calculateGrant(john));
		System.out.println(john.toString());
	}

	public static double calculateGrant(Farmer farmer) {
		double grant = 0.0;
		switch (farmer) {
		case DAIRY:
			grant = farmer.getNumAcres() < 200 ? 300.0 * farmer.getNumAcres() : 80.0 * farmer.getNumAcres();
			break;
		case BEEF:
			grant = farmer.getNumAcres() < 200 ? 200.0 * farmer.getNumAcres() : 50.0 * farmer.getNumAcres();
			break;
		case SHEEP:
			grant = farmer.getNumAcres() < 200 ? 150.0 * farmer.getNumAcres() : 40.0 * farmer.getNumAcres();
			break;
		}
		return grant;
	}

}
