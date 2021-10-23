package factory;

public class Florida extends USA {
  
	public Florida() {
		setName("Florida State");
		setVaccinated("1.Number of Peple Vaccinated"
				+ "60.5 % population fully vaccinated");
		setUnVaccinated("2.People not Vaccinated"
				+ "40%");
		setDeceased("3.No of Deceased People"
				+ "5600");
		setRecovered("4.People Recovered"
				+ "2,527,022");
		setActiveCondition("5.Active Cases"
				+ "2,150,292");
	}
}
