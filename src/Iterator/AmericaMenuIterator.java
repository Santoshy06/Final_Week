package Iterator;

import factory.America;

public class AmericaMenuIterator implements Iterator {

	
	America [] americaMenu;
	int position;
	public AmericaMenuIterator(America[] americaMenu) {
		this.americaMenu = americaMenu;
	}
	
	@Override
	public boolean hasNext() {
		if(position > americaMenu.length || americaMenu[position] == null) {
			return false;
		}
		else return true;
	}

	@Override
	public America next() {
		
		America americaMenupos = (America) americaMenu[position];
		position = position +1;
		
		return americaMenupos;
	}
}
