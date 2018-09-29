package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double botax;
		botax = population*growthRate + 0.50*population;
		System.out.println(botax);
		return botax;
	}

}
