package state;

public class PrintAllCountries {
	
	public void PrintAmericaMenu() {
		AmericaMenu americaMenu = new AmericaMenu();
		PrintAmericaMenu printAmericaMenu = new PrintAmericaMenu(americaMenu);
		printAmericaMenu.PrintMenu();
	}

	public void printEuropeMenu() {
		EuropeMenu europeMenu= new EuropeMenu();
		PrintEuropeMenu printEuropeMenu= new PrintEuropeMenu(europeMenu);
		printEuropeMenu.PrintMenu();
	}
	
	public void printAfricaMenu() {
		AfricaMenu africaMenu= new AfricaMenu();
		PrintAfricaMenu printAfricaMenu= new PrintAfricaMenu(africaMenu);
		printAfricaMenu.PrintMenu();
	}
	
}
