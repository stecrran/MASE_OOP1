package enums.complex;

public class Holiday {

	public static void main(String[] args) {
		goSomewhere(Direction.NORTH);
		Direction south = Direction.SOUTH;
		goSomewhere(south);
	}
	
	public static void goSomewhere(Direction d) {
		System.out.println(d.toString());
	}

}
