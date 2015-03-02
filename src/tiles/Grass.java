package tiles;

import java.awt.Color;

import greenfoot.World;

public class Grass extends Tile{
	private final static Color color = new Color(0x005C09);
	private final static int id = 0;
	public Grass(World world, int x, int y){
		super(world,x,y);
		this.setImage("Images/grass.jpg");
		this.getImage().scale(50, 50);
	}
}
