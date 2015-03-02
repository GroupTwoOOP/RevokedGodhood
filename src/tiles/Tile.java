package tiles;

import java.awt.Color;

import greenfoot.Actor;
import greenfoot.GreenfootImage;
import greenfoot.World;

public class Tile extends Actor{
	protected final static int tileSize = 50;
	public Tile(World world, int x, int y){
		GreenfootImage image = new GreenfootImage(tileSize, tileSize);
		image.setColor(Color.gray);
		image.drawRect(0, 0, tileSize - 1, tileSize - 1);
		setImage(image);
		world.addObject(this, x, y);
	}
}
