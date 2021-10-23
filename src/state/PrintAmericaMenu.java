package state;

import Iterator.Iterator;
import factory.America;

public class PrintAmericaMenu implements PrintsMenu {

	AmericaMenu americaMenu;


	public PrintAmericaMenu(AmericaMenu americaMenu) {
		this.americaMenu = americaMenu;

	}

	public void PrintMenu() {

		Iterator americaIterator = americaMenu.createIterator();
		printMenu(americaIterator);
	}

	private void printMenu(Iterator iterator) {

		System.out.println( "\n\n\n\n*************America Continent*************\n\n");

		while(iterator.hasNext()) {
			America america = (America) iterator.next();

			System.out.println("\n============"+america.getName()+ "============"+ "\t");
			System.out.println(america.getVacinated()  + "\t");
			System.out.println(america.getUnvaccinated()  + "\t");
			System.out.println(america.getDeceased()  + "\t");
			System.out.println(america.getRecovered()  + "\t");
			System.out.println(america.getActiveCondition()  + "\t");
			
		
		}
		
	
	}
}