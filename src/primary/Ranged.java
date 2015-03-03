package box;

import greenfoot.Actor;

public class Ranged extends Actor{

	static String[] range = {"ranged/arrow.png", "ranged/fire.png", "ranged/ice.png", "ranged/lightning.png"};
	private int n, dmg;
	public Ranged(int image, int rotation){
		this.setRotation(rotation);
		this.n = image;
		switch(image){
		case 0:
			setImage(range[image]);
			break;
		case 1:
			setImage(range[image]);
			break;
		case 2:
			setImage(range[image]);
			break;
		case 3:
			setImage(range[image]);
			break;
		}
	}
	public int getDmg(){
		switch(n){
		case 0:
			dmg = 5;
			break;
		case 1:
			dmg = 10;
			break;
		case 2:
			dmg = 10;
			break;
		case 3:
			dmg = 10;
			break;
		}
		return dmg;
	}
}
