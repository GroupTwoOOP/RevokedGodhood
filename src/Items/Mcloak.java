package Items;

import java.util.Random;

public class Mcloak extends Items{

	private static final long serialVersionUID = 3454097203316660669L;
	static String type = "Mcloak";
	Random mixer = new Random();
	static String[] mcloak = {"images/mcloak1.png", "images/mcloak2.png", "images/mcloak3.png", "images/mcloak4.png", "images/mcloak5.png"};
	public Mcloak(String s, boolean loot) {
		super(s, type, loot);
		
	}

}
