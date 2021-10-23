package Iterator;

import factory.Europe;

public class EuropeMenuIterator implements Iterator {

	Europe [] europeMenu;
	int position;
	public EuropeMenuIterator(Europe[] europeMenu) {
		this.europeMenu = europeMenu;
	}
	
	@Override
	public boolean hasNext() {
		if(position > europeMenu.length || europeMenu[position] == null) {
			return false;
		}
		else return true;
	}

	@Override
	public Europe next() {
		
		Europe europeMenupos = (Europe) europeMenu[position];
		position = position +1;
		
		return europeMenupos;
	}
}
