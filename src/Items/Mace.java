package Items;

import java.util.Random;

public class Mace extends Items{

	private static final long serialVersionUID = 1202185283073699047L;
	static String type = "Mace";
	Random mixer = new Random();
	static String[] mace = {"images/mace1.png", "images/mace2.png", "images/mace3.png", "images/mace4.png"};
	public Mace(String s, boolean loot) {
		super(s, type, loot);
		
	}

}
