package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		
		Animal Ulysses = new Cow();
		Animal Persephone = new Pig();
		Animal Charlemagne = new Chicken();
		Animal Socrates = new Goat();
		Animal Plato = new Cow();
		Animal Aristotle = new Pig();
		
		farm.add(Ulysses);
		farm.add(Persephone);
		farm.add(Charlemagne);
		farm.add(Socrates);
		farm.add(Plato);
		farm.add(Aristotle);
		
		for (int i = 0; i < farm.size(); i++) {
			farm.get(i).makeNoise();
			farm.get(i).isEating();
		}
	}

	public Farm() {
		// TODO Auto-generated constructor stub
	}

}
