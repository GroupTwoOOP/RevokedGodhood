package Items;

import java.util.Random;


public class Dagger extends Items{
	private static final long serialVersionUID = -6777198472829783253L;
	static String type = "Dagger";
	Random mixer = new Random();
	static String[] dagger = {"images/dagger1.png", "images/dagger2.png", "images/dagger3.png", "images/dagger4.png"};
	public Dagger(String s, boolean loot) {
		super(s, type, loot);

	}

}
