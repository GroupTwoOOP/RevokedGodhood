package Items;

import java.util.Random;


public class Staff extends Items{
	private static final long serialVersionUID = 7438026489561827097L;
	static String type = "Staff";
	Random mixer = new Random();
	static String[] staff = {"images/staff1.png", "images/staff2.png", "images/staff3.png", "images/staff4.png"};
	public Staff(String s, boolean loot) {
		super(s, type, loot);

		
	}

}
