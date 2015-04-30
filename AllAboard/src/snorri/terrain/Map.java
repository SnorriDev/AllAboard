package snorri.terrain;

import snorri.allaboard.AllAboard;
import snorri.character.Player;


public class Map {
	private int					size;							//length of one side of square map
	private Tile[][]			grid;							//array containing each piece of the map
	private static final int	magnificationMultiplier	= 30;	//multiplier for screen resolution size
																
	public Map(int size) {
		grid = new Tile[size][size];
	}
	
	public void render(AllAboard game, int renderX, int renderY) { // renders the map for some distance around the player
		Player player = game.getPlayer();
		for (double x = player.getX() - renderX; x < player.getX() + renderX; x++) {
			for (double y = player.getY() - renderY; y < player.getY() + renderY; y++) {
				if (grid[(int)x][(int)y] == null)
					continue;
				game.drawRect((int)(x * magnificationMultiplier), (int)(y * magnificationMultiplier), magnificationMultiplier, magnificationMultiplier);
				//TODO: generate a real map, not this temporary fake shit
			}
		}
	}
}
