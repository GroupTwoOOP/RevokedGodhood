package tiles;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import java.util.Random;
import primary.Player;

public class Merchant extends Actor{

	Random mixer = new Random();
	private int money = mixer.nextInt(500) + 500;
	static String merchant = "image/merchant.png";
	public Merchant(){
		this.setImage(merchant);
	}
	public void act(){
		if(getObjectsInRange(2, Player.class) != null){
			if(Greenfoot.isKeyDown("m")){
				
			}
		}
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}
