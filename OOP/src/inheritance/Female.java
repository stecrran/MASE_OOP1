package inheritance;

public class Female extends Human {

	@Override
	public String whoAmI() {
		return "Female";
	}
	@Override
	public String toString() {
		return "Female";
	}

}

class Women extends Female {
	
	@Override
	public String toString() {
		return "Women";
	}
}


class Girl extends Female {
	
	@Override
	public String toString() {
		return "Girl";
	}
}