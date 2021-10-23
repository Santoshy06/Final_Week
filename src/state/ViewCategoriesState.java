package state;

import java.util.Scanner;


public class ViewCategoriesState implements State {

	@Override
	public void printAllCountries (Context context) {
		Scanner input = new Scanner(System.in);
		System.out.println( "\n\n *********Corona Virus Statistics********\n\n"+
		"Enter number for Selection\n"+
		"1.America Data\n"+
		"2.Europe Data\n"+
		"3.Africa Data\n");

		int choice = input.nextInt();

			if(choice == 1) {
				AmericaMenu americamenu = new AmericaMenu();
				PrintAmericaMenu printAmericaMenu = new PrintAmericaMenu(americamenu);
			    printAmericaMenu.PrintMenu();
			}
			else if(choice == 2) {
				EuropeMenu europemenu = new EuropeMenu();
				PrintEuropeMenu printEuropeMenu = new PrintEuropeMenu(europemenu);
				printEuropeMenu.PrintMenu();
			}

			else if(choice == 3) {
				AfricaMenu africamenu = new AfricaMenu();
				PrintAfricaMenu printAfricaMenu = new PrintAfricaMenu(africamenu);
				printAfricaMenu.PrintMenu();

			}


			FollowUpState followUpState = new FollowUpState();
			followUpState.printAllCountries(context);

	}

}
