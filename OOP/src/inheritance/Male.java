package inheritance;

public class Male extends Human {

	@Override
	public String whoAmI() {
		return "Male";
	}

	@Override
	public String toString() {
		return "Male";
	}
	
	public String show() {
		return "I am a man.";
	}

	
}

class Man extends Male {
	
	@Override
	public String toString() {
		return "Man";
	}
}


class Boy extends Male {
	

}