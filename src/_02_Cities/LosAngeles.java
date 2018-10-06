package _02_Cities;

public class LosAngeles extends City {

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);

	}

	@Override
	double getAnnualTaxes() {
		double latax;
		latax = population * 0.5 * growthRate * growthRate;
		System.out.println(latax);
		return latax;
	}

}
