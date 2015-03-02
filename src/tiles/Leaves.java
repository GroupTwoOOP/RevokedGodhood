package tiles;

import greenfoot.World;

import java.awt.Color;

public class Leaves extends Tile{
	private final static Color color = new Color(0x836539);
	private final static int id = 5;
	public Leaves(World world, int x, int y){
		super(world,x,y);

		this.setImage("Images/leaves.jpg");
		this.getImage().scale(50,50);
	}
}
