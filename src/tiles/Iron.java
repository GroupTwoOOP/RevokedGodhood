package tiles;

import java.awt.Color;

import greenfoot.World;

public class Iron extends Tile{
	private final static Color color = new Color(0x005C09);
	private final static int id = 6;
	public Iron(World world, int x, int y){
		super(world,x,y);
		this.setImage("Images/iron.jpg");
		this.getImage().scale(50, 50);
	}
}
