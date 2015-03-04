package Items;

import java.util.Random;

public class Lshield extends Items{

	private static final long serialVersionUID = -8333309696254540400L;
	static String type = "Lshield";
	Random mixer = new Random();
	static String[] lshield = {"images/lshield1.png", "images/lshield2.png", "images/lshield3.png", "images/lshield4.png"};
	public Lshield(String s, boolean loot) {
		super(s, type, loot);
		
	}

}
