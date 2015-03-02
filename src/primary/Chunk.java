package primary;

import greenfoot.Greenfoot;
import tiles.Dirt;
import tiles.Tile;

public class Chunk {
	public final static int chunkSize = 50;
	public int[][] tileMap = new int[chunkSize][chunkSize];
	public Chunk(){
		for (int x = 0; x < chunkSize; x++){
			for (int y = 0; y < chunkSize; y++){
				tileMap[x][y] = getRandomTileType();
			}
		}
	}
	public int getRandomTileType(){
		int number = Greenfoot.getRandomNumber(2);
		System.out.println(number);
		return number;
	}
}
