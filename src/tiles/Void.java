package tiles;

import greenfoot.GreenfootImage;
import greenfoot.World;
import interfaces.IObstical;

import java.awt.Color;

public class Void extends Tile implements IObstical{
	private final static Color color = new Color(0x836539);
	private final static int id = 99;
	public Void (World world, int x, int y){
		super(world,x,y);
		GreenfootImage image = new GreenfootImage(50,50);
		image.setColor(Color.black);
		image.fill();
		setImage(image);
	}
}
