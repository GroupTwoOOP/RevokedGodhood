package Items;

import java.util.Random;

public class Lboot extends Items{

	private static final long serialVersionUID = -4530593048441506082L;
	static String type = "Lboot";
	Random mixer = new Random();
	static String [] lboot = {"images/lboot1.png", "images/lboot2.png", "images/lboot3.png"};
	public Lboot(String s, boolean loot) {
		super(s, type, loot);
		
	}

}
