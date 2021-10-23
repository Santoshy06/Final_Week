package factory;
public class USA extends America{
	
   public USA() {
	   setName("USA Continent");
	   setVaccinated("1.People fully Vaccinated."
	   		+ "103,056,866, 87.2% of Population");
		setUnVaccinated("2.people not yet vaccinated. "
				+ "10,046,234 12.8% of Populaton");
		setDeceased("3.Number of people Deceased."
				+ "1,090,978");
		setRecovered("4.Number of Recoveries. "
				+ "24,345,021");
		setActiveCondition("5.Number of Active Covid cases."
				+ "7,970,292");
}

}
