package Items;

import java.util.Random;

public class Hglove extends Items{

	private static final long serialVersionUID = -4654542806245341351L;
	static String type = "Hglove";
	Random mixer = new Random();
	static String[] hglove = {"images/hglove1.png", "images/hglove2.png", "images/hglove3.png"};
	public Hglove(String s, boolean loot) {
		super(s, type, loot);
		
	}

}
