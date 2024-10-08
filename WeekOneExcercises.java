package weekOne;

import java.util.Scanner;

public class WeekOneExcercises {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		if (didOswaldActAlone()) {
			System.out.println("Oswald acted alone");
		} else {
			System.out.println("Oswald wasn't alone.");
		}
		
		System.out.println();
		WeekOneExcercises example = new WeekOneExcercises();
		if (example.wasOjGuilty()) {
			System.out.println("OJ was innocent.");
		} else {
			System.out.println("OJ was not innocent.");
		}
		
		System.out.println();
		String film = favouriteFilm();
		System.out.println("Your favourite film is " + film);
		
		System.out.println();
		System.out.println("Your rating for \"" + film + "\" is " + filmRating(film) + " out of 10.");
		
	}


	public static boolean didOswaldActAlone() {
		System.out.print("Do you think Lee Harvey Oswald acted alone? \n(true / false) > ");
		return sc.nextBoolean();
	}

	public boolean wasOjGuilty() {
		System.out.print("Do you think OJ Simpson was guilty? \n(true / false) > ");
		return sc.nextBoolean();
	}

	public static String favouriteFilm() {
		System.out.print("What is your favorite film? \n> ");
		return sc.next();
	}

	public static int filmRating(String film) {
		System.out.print("What rating would you give \"" + film + "\" ? (Out of 10) \n> ");
		return sc.nextInt();
	}

}
