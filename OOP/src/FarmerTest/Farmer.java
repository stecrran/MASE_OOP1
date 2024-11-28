package FarmerTest;

public enum Farmer {

	DAIRY(200),
	BEEF(150),
	SHEEP(160);
	
	
	private int numAcres;
	
	private Farmer(int numAcres) {
		this.numAcres = numAcres;
	}
	
	public void setNumAcres(int numAcres) {
		this.numAcres = numAcres;
	}
	
	public int getNumAcres() {
		return numAcres;
	}
	
	public String toString() {
		return ("Farmer ");
	}

	
}
