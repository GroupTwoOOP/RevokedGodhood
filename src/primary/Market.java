package primary;

import java.awt.Color;

public class Market extends greenfoot.World{

	private static final int WORLD_WIDTH = 15, WORLD_HEIGHT = 18, CELL = 50;
	private Color brown = new Color(122, 82, 48);
	public Market() {
		super(WORLD_WIDTH, WORLD_HEIGHT, CELL);
		this.getBackground().setColor(brown);
		this.getBackground().fill();
		
	}

}
