package Items;

import java.util.Random;

public class Axe extends Items{

	private static final long serialVersionUID = -7571285548225398352L;
	static String type = "Axe";
	Random mixer = new Random();
	static String[] axe = {"images/axe1.png", "images/axe2.png", "images/axe3.png", "images/axe4.png"};
	public Axe(String s, boolean loot) {
		super(s, type, loot);
		
	}

}
