package Items;

import java.util.Random;

public class Potion extends Items {
	private static final long serialVersionUID = -5640447394046202906L;
	static String type = "Potion";
	Random mixer = new Random();
	static String potion = "images/health.png";
	public Potion(String s, boolean loot) {
		super(s, type, loot);
		rename("Lv: " + getRank() + "Health Potion");
	}

}
