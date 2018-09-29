package _02_Cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double sdtax;
		sdtax = population*growthRate + 1000000;
		System.out.println(sdtax);
		return sdtax;
	}
}
