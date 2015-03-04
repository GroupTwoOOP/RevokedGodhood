package Items;

import java.util.Random;

public class Lhelmet extends Items{

	private static final long serialVersionUID = 326502047535657L;
	static String type = "Lhelmet";
	Random mixer = new Random();
	static String[] lhelmet = {"images/lhelmet1.png", "images/lhelmet2.png", "images/lhelmet3.png"};
	public Lhelmet(String s, boolean loot) {
		super(s, type, loot);
		
	}

}
