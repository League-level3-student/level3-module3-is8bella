package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double BOtax;
		BOtax = population * growthRate + population * 0.50;
		System.out.println(BOtax);
		return BOtax;
	}

}
