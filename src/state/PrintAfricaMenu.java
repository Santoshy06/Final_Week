package state;

import Iterator.Iterator;
import factory.Africa;
public class PrintAfricaMenu implements PrintsMenu{


	AfricaMenu africaMenu;


	public PrintAfricaMenu(AfricaMenu africaMenu) {
		this.africaMenu = africaMenu;
}

	public void PrintMenu() {

		Iterator iterateAfricaMenu = africaMenu.createIterator();
		printMenu(iterateAfricaMenu);
	}

	private void printMenu(Iterator iterator) {

		System.out.println( "\n\n\n\n*************Africa Continent*************\n\n");

		while(iterator.hasNext()) {
			Africa africa = (Africa) iterator.next();


			System.out.println("\n============"+africa.getName()+ "============"+ "\t");
			System.out.println(africa.getVacinated()  + "\t");
			System.out.println(africa.getUnvaccinated()  + "\t");
			System.out.println(africa.getDeceased()  + "\t");
			System.out.println(africa.getRecovered()  + "\t");
			System.out.println(africa.getActiveCondition()  + "\t");
			
		}
}
}
