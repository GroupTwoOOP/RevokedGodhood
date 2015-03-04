package Items;

import java.util.Random;

public class Sword extends Items{
	private static final long serialVersionUID = -2663929683396104176L;
	static String type = "Sword";
	Random mixer = new Random();
	static String[] sword = {"images/sword1.png", "images/sword2.png", "images/sword3.png", "images/sword4.png"};
	public Sword(String s, boolean loot) {
		super(s, type, loot);
		
	}

}
