package tiles;

import interfaces.IObstical;

import java.awt.Color;

import greenfoot.World;

public class Lava extends Tile implements IObstical{
	private final static Color color = new Color(0x005C09);
	private final static int id = 7;
	public Lava(World world, int x, int y){
		super(world,x,y);

		this.setImage("Images/lava.jpg");
		this.getImage().scale(50, 50);
	}
}
