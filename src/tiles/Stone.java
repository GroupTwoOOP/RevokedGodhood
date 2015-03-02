package tiles;

import greenfoot.World;

import java.awt.Color;

public class Stone extends Tile{
	private final static Color color = new Color(0x836539);
	private final static int id = 4;
	public Stone(World world, int x, int y){
		super(world,x,y);

		this.setImage("Images/stone.jpg");
		this.getImage().scale(50,50);
	}
}
