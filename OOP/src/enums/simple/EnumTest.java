package enums.simple;

public class EnumTest {

	Day day;

	public static void main(String[] args) {
		EnumTest monday = new EnumTest(Day.MONDAY);
		EnumTest tuesday = new EnumTest(Day.TUESDAY);
		EnumTest wednesday = new EnumTest(Day.WEDNESDAY);
		EnumTest thursday = new EnumTest(Day.THURSDAY);
		EnumTest friday = new EnumTest(Day.FRIDAY);
		EnumTest saturday = new EnumTest(Day.SATURDAY);
		EnumTest sunday = new EnumTest(Day.SUNDAY);
		
		monday.tellItLikeItIs();
		tuesday.tellItLikeItIs();
		wednesday.tellItLikeItIs();
		thursday.tellItLikeItIs();
		friday.tellItLikeItIs();
		saturday.tellItLikeItIs();
		sunday.tellItLikeItIs();
	}

	public EnumTest(Day day) {
		this.day = day;
	}

	public void tellItLikeItIs() {
		
		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;
		case TUESDAY, WEDNESDAY, THURSDAY:
			System.out.println("Midweek days are okay.");
			break;
		case FRIDAY:
			System.out.println("Fridays are better.");
			break;
		case SATURDAY, SUNDAY:
			System.out.println("Weekends are best.");
			break;
		default:
			break;
		}
	}

}
