package state;

import Iterator.Iterator;
import factory.Europe;

public class PrintEuropeMenu implements PrintsMenu {

	EuropeMenu europeMenu;


	public PrintEuropeMenu(EuropeMenu europeMenu) {
		this.europeMenu = europeMenu;
}

	public void PrintMenu() {

		Iterator iterateEuropeMenu = europeMenu.createIterator();
		printMenu(iterateEuropeMenu);
	}

	private void printMenu(Iterator iterator) {

		System.out.println( "\n\n\n\n*************Europe Continent*************\n\n");

		while(iterator.hasNext()) {
			Europe europe = (Europe) iterator.next();


			System.out.println("\n============"+europe.getName()+ "============"+ "\t");
			System.out.println(europe.getVacinated()  + "\t");
			System.out.println(europe.getUnvaccinated()  + "\t");
			System.out.println(europe.getDeceased()  + "\t");
			System.out.println(europe.getRecovered()  + "\t");
			System.out.println(europe.getActiveCondition()  + "\t");
			
		}
}
}
