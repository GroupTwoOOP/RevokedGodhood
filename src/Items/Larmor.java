package Items;

import java.util.Random;

public class Larmor extends Items{

	private static final long serialVersionUID = 7104547057660448088L;
	static String type = "Larmor";
	Random mixer = new Random();
	static String[] Larmor = {"images/larmor1.png", "images/larmor2.png", "images/larmor3.png"};
	public Larmor(String s, boolean loot) {
		super(s, type, loot);
		
	}

}
