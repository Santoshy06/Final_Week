package state;

import Iterator.AmericaMenuIterator;
import Iterator.Iterator;
import factory.America;
import factory.Brazil;
import factory.USA;

public class AmericaMenu {


		int numberOfItems = 0;
		America[] americaMenu;
		public AmericaMenu() {
			americaMenu = new America[6];
			americaMenu[0] = new USA();
			americaMenu[1] = new Brazil();
		}

		public Iterator createIterator() {
			return new AmericaMenuIterator(americaMenu);
		}
}

