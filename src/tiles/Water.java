package tiles;

import greenfoot.World;

import java.awt.Color;

public class Water extends Tile{
	private final static Color color = new Color(0x836539);
	private final static int id = 2;
	public Water(World world, int x, int y){
		super(world,x,y);
		this.setImage("Images/water.jpg");
		this.getImage().scale(50,50);
	}
}
