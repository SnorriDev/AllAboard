package snorri.character;

public abstract class Character {
	protected double	x, y;	//coordinates of character
		
	public Character(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() { //returns x position of character
		return x;
	}
	
	public double getY() { //returns y position of character
		return y;
	}
}
