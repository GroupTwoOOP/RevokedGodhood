package Items;

import java.util.Random;

public class Mhat extends Items{

	private static final long serialVersionUID = -6805200780749874261L;
	static String type = "Mhat";
	Random mixer = new Random();
	static String[] mhat = {"images/mhat1.png", "images/mhat2.png", "images/mhat3.png", "images/mhat4.png"};
	public Mhat(String s, String type2, boolean loot) {
		super(s, type2, loot);
		
	}

}
