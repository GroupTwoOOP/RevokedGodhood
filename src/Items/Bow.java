package Items;

import java.util.Random;

public class Bow extends Items{
	private static final long serialVersionUID = 7661922885303153746L;
	static String type = "Bow";
	Random mixer = new Random();
	static String[] bow = {"images/bow1.png", "images/bow2.png", "images/bow3.png", "images/bow4.png"};
	public Bow(String s, boolean loot) {
		super(s, type, loot);
		
	}

}
