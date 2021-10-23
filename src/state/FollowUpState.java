package state;

import java.util.Scanner;

public class FollowUpState implements State {

	@Override
	public void printAllCountries(Context context) {
		Scanner input = new Scanner(System.in);
		System.out.println( "\n\nWhat do you want to do next\n"+
		"1.Main menu\n"+
		"2.View Categories\n"+
		"3.View All Countries\n"+
		"4.Log out");

		int choice = input.nextInt();

		switch(choice) {
		case 1:
			MainMenuStatus mainMenuState = new MainMenuStatus();
			mainMenuState.printAllCountries(context);
			break;
		case 2:
			ViewCategoriesState categoriesState = new ViewCategoriesState();
			categoriesState.printAllCountries(context);
			break;
		case 3:
			ViewAllCountriesState allCountries = new ViewAllCountriesState();
			allCountries.printAllCountries(context);
			break;
		case 4:
			System.out.println("Log Off");
			System.exit(0);
			break;
		}

	}

}
