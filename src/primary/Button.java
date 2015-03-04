package primary;

import greenfoot.Actor;
import greenfoot.Greenfoot;

public class Button extends Actor{

	static String[] button = {"images/exit.png", "images/load.png", "images/new.png", "images/save.png"};
	private int num;
	public Button( int i){
		this.num = i;
			this.setImage(button[i]);
	}
	public void act(){
		onClick();
	}
	private void onClick() {
		if(Greenfoot.mouseClicked(this)){
			switch(num){
			case 0: 
				System.exit(0);
				break;
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			}
		}
	}
}
