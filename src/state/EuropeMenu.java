package state;

import Iterator.EuropeMenuIterator;
import Iterator.Iterator;
import factory.Europe;
import factory.Italy;
import factory.Spain;

public class EuropeMenu {

	int numberOfItems = 0;
	Europe[] europeMenu;
	public EuropeMenu() {
		europeMenu = new Europe[3];
		europeMenu[0] = new Italy();
		europeMenu[1] = new Spain();
	}

	public Iterator createIterator() {
		return new EuropeMenuIterator(europeMenu);
	}
}
