package state;

import java.util.Scanner;

public class MainMenuStatus implements State {

		@Override
		public void printAllCountries(Context context) {
			Scanner input = new Scanner(System.in);
			System.out.println( "\n\n *********Corona Virus Statistics********\n\n"+
			"Enter number for Menu Selection\n"+
			"1.View All Countries \n"+
			"2.View All Categories\n"+
			"3.Quit\n");

			int choice = input.nextInt();

			switch(choice) {
			case 1:
				ViewAllCountriesState allCountries = new ViewAllCountriesState();
				allCountries.printAllCountries(context);
				break;
			case 2:
				ViewCategoriesState categoriesState = new ViewCategoriesState();
				categoriesState.printAllCountries(context);
				break;
			case 3:
				System.out.println("Logoff");
				System.exit(0);
			}

		}
}
