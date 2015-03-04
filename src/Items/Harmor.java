package Items;

import java.util.Random;

public class Harmor extends Items{

	private static final long serialVersionUID = -1435427784838022224L;
	static String type = "Harmor";
	Random mixer = new Random();
	static String[] harmor = {"images/harmor1.png", "images/harmor2.png", "images/harmor3.png"};
	public Harmor(String s, boolean loot) {
		super(s, type, loot);
		
	}

}
