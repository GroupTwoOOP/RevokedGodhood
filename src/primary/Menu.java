package primary;

import java.awt.Color;
import greenfoot.World;

public class Menu extends World{

	private static final int WORLD_WIDTH = 15, WORLD_HEIGHT = 18, CELL = 50;
	private int Y = 4;
	
	public Menu() {
		super(WORLD_WIDTH, WORLD_HEIGHT, CELL);
		this.getBackground().setColor(Color.LIGHT_GRAY);
		this.getBackground().fill();
		
		for(int i=2;i>=0;i--){
			this.addObject(new Button(i), 14, Y);
			Y += 7;
		}
	}

	
}
