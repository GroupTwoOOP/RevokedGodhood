package Items;

import java.util.Random;

public class Hhelmet extends Items{

	private static final long serialVersionUID = -1012590048771032687L;
	static String type = "Hhelmet";
	Random mixer = new Random();
	static String[] hhelmet = {"images/hhelmet1.png", "images/hhelmet2.png", "images/hhelmet3.png"};
	public Hhelmet(String s, boolean loot) {
		super(s, type, loot);
		
	}

}
