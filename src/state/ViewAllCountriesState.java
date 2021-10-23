package state;
import java.util.Scanner;

public class ViewAllCountriesState implements State {
	
	@Override
	public void printAllCountries(Context context) {
		PrintAllCountries allCountries = new PrintAllCountries();
		allCountries.printEuropeMenu();
		System.out.print("\n\n\n");
		allCountries.PrintAmericaMenu();
		System.out.print("\n\n\n");
		allCountries.PrintAmericaMenu();

		Scanner input = new Scanner(System.in);

		System.out.println("\n\nWhat do you want to do next?\n\n"
				+ "1) Main menu\n"
				+ "2) View Categories\n"
				+ "3) Logoff\n");

		int choice = input.nextInt();

		switch(choice) {
		case 1:
			MainMenuStatus mainMenuStatus = new MainMenuStatus();
			mainMenuStatus.printAllCountries(context);
			break;
		case 2:
			ViewCategoriesState categoriesState = new ViewCategoriesState();
			categoriesState.printAllCountries(context);
			break;
		}

		FollowUpState followUpState = new FollowUpState();
		followUpState.printAllCountries(context);
	}

}
