package Items;

import java.util.Random;

public class Hboot extends Items{

	private static final long serialVersionUID = -2837579651327279183L;
	static String type = "Hboot";
	Random mixer = new Random();
	static String[] hboot = {"images/hboot1.png", "images/hboot2.png", "images/hboot3.png"};
	public Hboot(String s, boolean loot) {
		super(s, type, loot);
		
	}

}
