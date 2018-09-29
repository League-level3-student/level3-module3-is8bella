package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String mixed = "";
		for (int i = 0; i < s.length(); i++) {
			if (i%2 == 0) { //toLowerCase() for every second number starting with second character. 
				mixed = mixed + s.toLowerCase().charAt(i);
			}
			else { //toUpperCase() for every second number starting with first character. 
				mixed = mixed + s.toUpperCase().charAt(i);
			}
		}
		//System.out.println("mixed: " + mixed);
		return mixed;
	}

}
