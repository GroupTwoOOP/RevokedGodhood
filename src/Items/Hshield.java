package Items;

import java.util.Random;

public class Hshield extends Items{

	private static final long serialVersionUID = -6256580351530138980L;
	Random mixer = new Random();
	static String type = "Hshield";
	static String[] Hshield = {"images/hshield1.png", "images/hshield2.png", "images/hshield3.png", "images/hshield4.png"};
	public Hshield(String s, boolean loot) {
		super(s, type, loot);
		
	}

}
