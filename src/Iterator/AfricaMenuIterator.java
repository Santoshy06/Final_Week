package Iterator;

import factory.Africa;

public class AfricaMenuIterator implements Iterator {

	Africa [] africaMenu;
	int position;
	public AfricaMenuIterator(Africa[] africaMenu) {
		this.africaMenu = africaMenu;
	}
	
	@Override
	public boolean hasNext() {
		if(position > africaMenu.length || africaMenu[position] == null) {
			return false;
		}
		else return true;
	}

	@Override
	public Africa next() {
		
		Africa africaMenupos = (Africa) africaMenu[position];
		position = position +1;
		
		return africaMenupos;
	}
	
}
