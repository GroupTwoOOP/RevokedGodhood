package Items;

import java.util.Random;

public class Lglove extends Items{

	private static final long serialVersionUID = 3313780420308707607L;
	static String type = "Lglove";
	Random mixer = new Random();
	static String[] lglove = {"images/lglove1.png", "images/lglove2.png", "images/lglove3.png"};
	public Lglove(String s, boolean loot) {
		super(s, type, loot);

	}

}
