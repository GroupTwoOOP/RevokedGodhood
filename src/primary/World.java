package primary;

import greenfoot.Greenfoot;
import tiles.*;

public class World extends greenfoot.World{
	private static World world;
	private final static int H = 15;
	private final static int W = 15;
	private final static int CS = 50;
	public World() {
		super(W, H, CS);
		world = this;
		new TileManager();
		this.setPaintOrder(Player.class, Tile.class);
	}
	public static World getWorld() {
		return world;
	}
	public static int getH() {
		return H;
	}
	public static int getW() {
		return W;
	}
	public static int getCs() {
		return CS;
	}	
}
