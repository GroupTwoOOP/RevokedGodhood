package primary;
import java.util.List;

import interfaces.IObstical;
import enums.DIRECTION;
import greenfoot.Actor;
import greenfoot.Greenfoot;

public class Player extends Actor{
	private int MyX = 0;
	private int MyY = 0;
	private int tempX = 0;
	private int tempY = 0;
	private boolean hasMoved = false;
	private DIRECTION dir = DIRECTION.NORTH;
	private TileManager tm;
	public Player(World world, int x, int y){
		this.setImage("Images/Goblin.png");
		world.addObject(this, x, y);
	}

	int health = 50;
	int speed = 1;

	public void act(){
		if(Greenfoot.isKeyDown("up")){
			this.setRotation(270);
			this.tempY--;
			this.dir = DIRECTION.NORTH;
			hasMoved = true;
		}if(Greenfoot.isKeyDown("down")){
			this.setRotation(90);
			this.tempY++;
			this.dir = DIRECTION.SOUTH;
			hasMoved = true;
		}if(Greenfoot.isKeyDown("left")){
			this.setRotation(180);
			this.tempX--;
			this.dir = DIRECTION.WEST;
			hasMoved = true;
		}if(Greenfoot.isKeyDown("right")){
			this.setRotation(0);
			this.tempX++;
			this.dir = DIRECTION.EAST;
			hasMoved = true;
		}
		if (hasMoved){
			tm.checkTile(tempX,tempY);	
			System.out.println(MyX + " " + MyY);
			hasMoved = false;
			MyX = tempX;
			MyY = tempY;
		}
		
	}
	public boolean canMove(){
		List<IObstical> obs = getNeighbours(2, false, IObstical.class);
		boolean result = true;
		for (IObstical IO : obs){
			if (obs != null){
				System.out.println(dir);
				switch(dir){
				case NORTH:
					if (this.getY() - 1 == IO.getY() && this.getX() == IO.getX()){
						result = false;
						System.out.println("N");
					}
					break;
				case SOUTH:
					if (this.getY() + 1 == IO.getY() && this.getX() == IO.getX()){
						result = false;
						System.out.println("S");
					}
					break;
				case EAST:
					if (this.getX() + 1 == IO.getX() && this.getY() == IO.getY()){
						result = false;
						System.out.println("E");
					}
					break;
				case WEST:
					if (this.getX() - 1 == IO.getX() && this.getY() == IO.getY()){
						result = false;
						System.out.println("W");
					}
					break;
				}
			}
		}
		return result;
	}
	public void setTileManager(TileManager tm){
		this.tm = tm;
	}
	public void setMyX(int x){
		this.MyX = x;
	}
	public int getMyX(){
		return MyX;
	}
	public void setTempX(int tx){
		this.tempX = tx;
	}
	public void setMyY(int y){
		this.MyY = y;
	}
	public int getMyY(){
		return MyY;
	}
	public void setTempY(int ty){
		this.tempY = ty;
	}
}