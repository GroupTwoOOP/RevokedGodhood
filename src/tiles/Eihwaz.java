package tiles;

import greenfoot.World;

import java.awt.Color;

public class Eihwaz extends Tile{
	private final static Color color = new Color(0x836539);
	private final static int id = 8;
	public Eihwaz(World world, int x, int y){
		super(world,x,y);

		this.setImage("Images/eihwaz.jpg");
		this.getImage().scale(50,50);
	}
}
