package factory;

public abstract class Country {

	String name;
	String vaccinated;
	String unvaccinated;
	String deceased;
	String recovered;
	String activeCondition;
	
	
	public String getVacinated() {
		return vaccinated;
	}
	public void setVaccinated(String vaccinated) {
		this.vaccinated = vaccinated;

	}
	public String getUnvaccinated() {
		return unvaccinated;
	}
	public void setUnVaccinated(String unvaccinated) {
		this.unvaccinated = unvaccinated;
	}

	public String getDeceased() {
		return deceased;
	}
	public void setDeceased(String deceased) {
		this.deceased = deceased;
	}
	
	public String getRecovered() {
		return recovered;
	}
	public void setRecovered(String recovered) {
		this.recovered = recovered;
	}

	public String getActiveCondition() {
		return activeCondition;
	}
	public void setActiveCondition(String activeCondition) {
		this.activeCondition = activeCondition;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
