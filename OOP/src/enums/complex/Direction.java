package enums.complex;

public enum Direction {
	NORTH("In a northerly direction"), 
	SOUTH("In a southerly direction"), 
	EAST("In a easterly direction"), 
	WEST("In a westerly direction");
	
	String direction;
	
	private Direction(String direction) {
		this.direction = direction;
	}
	
	@Override
	public String toString() {
		return "We are travelling " + direction;
	}
}
