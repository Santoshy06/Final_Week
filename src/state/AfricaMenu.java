package state;

import Iterator.AfricaMenuIterator;
import Iterator.Iterator;
import factory.Africa;
import factory.Egypt;
import factory.Kenya;

public class AfricaMenu {

	int numberOfItems = 0;
	Africa[] africaMenu;
	public AfricaMenu() {
		africaMenu = new Africa[3];
		africaMenu[0] = new Kenya();
		africaMenu[1] = new Egypt();
	}

	public Iterator createIterator() {
		return new AfricaMenuIterator(africaMenu);
	}
}
