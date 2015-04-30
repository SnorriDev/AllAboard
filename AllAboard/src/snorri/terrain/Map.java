package snorri.terrain;

public class Map {
	private int			size;
	private Tile[][]	grid;
	
	public Map(int size) {
		grid = new Tile[size][size];
	}
}
