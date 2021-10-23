package state;


public class Main {

	public static void main(String[] args) {
		Context context = new Context();
		MainMenuStatus mainMenu = new MainMenuStatus();
		mainMenu.printAllCountries(context);
	}

}
