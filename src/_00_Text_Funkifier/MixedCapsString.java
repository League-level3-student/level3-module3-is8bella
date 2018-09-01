package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String specialmcs = "";
		String mcs = "This is also a test";
		for (int i = 0; i < mcs.length(); i++) {
			if (i%2 == 0) {
				specialmcs = specialmcs + mcs.charAt(i);
			}
		}
		System.out.println(specialmcs);
		return "";
	}

}
