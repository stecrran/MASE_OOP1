package enums;

public enum Farmer {
	DAIRY(200), BEEF(150), SHEEP(160);

	private int numAcres;

	Farmer(int numAcres) {
		this.numAcres = numAcres;
	}


	public int getNumAcres() {
		return numAcres;
	}

	public void setNumAcres(int numAcres) {
		this.numAcres = numAcres;
	}

	@Override
	public String toString() {
		final int DAIRY = 1, BEEF = 2, SHEEP = 3;

		switch (this.ordinal()) {
		case 1:
			return "Dairy Farmer with " + numAcres + " acres.";
		case 2:
			return "Beef Farmer with " + numAcres + " acres.";
		case 3:
			return "Sheep Farmer with " + numAcres + " acres.";
		default:
			return "Not a farmer.";
		}
	}
}
