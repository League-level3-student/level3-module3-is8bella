package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double atax;
		atax = population*growthRate*2*growthRate; 
		System.out.println(atax);
		return atax;
	}

}
