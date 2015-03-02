package tiles;

import greenfoot.World;

import java.awt.Color;

public class Kenaz extends Tile{
	private final static Color color = new Color(0x836539);
	private final static int id = 9;
	public Kenaz(World world, int x, int y){
		super(world,x,y);

		this.setImage("Images/kenaz.jpg");
		this.getImage().scale(50,50);
	}
}
