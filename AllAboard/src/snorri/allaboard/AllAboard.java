package snorri.allaboard;

import processing.core.PApplet;
import snorri.character.Player;
import snorri.terrain.Map;


public class AllAboard extends PApplet {
	
	private static final long	serialVersionUID	= 1L;				//fixes error, not important
	int							size				= 1024;			// length of one side of square map grid
	Map							gameMap				= new Map(size);	//where the game is played
	Player						player1				= new Player(0, 0); //the user's player character
																		
																		
	@Override
	public void setup() {
		
	}
	
	@Override
	public void draw() {
		//rect(20, 20, 20, 20);
	}
	
	public void drawRect(int x, int y, int width, int height) { //allows other classes to access the rect command
		rect(x, y, width, height);
	}
	
	public Player getPlayer() { //returns the user's player
		return player1;
	}
}