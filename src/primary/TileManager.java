package primary;

import java.util.List;

import tiles.*;
import tiles.Void;


public class TileManager {
	private static Tile[][] tiles = new Tile[World.getW()][World.getH()];
	private static Player player;
	private Chunk chunk;
	public TileManager(){
		chunk = new Chunk();
		int[][] tileMap = chunk.tileMap;
		for (int x = 0; x < World.getW(); x++){
			for (int y = 0; y < World.getH(); y++){
				tiles[x][y] = getTileByID(tileMap[x][y], x, y);
			}
		}
		player = new Player(World.getWorld(),World.getW()/2, World.getH()/2);
		player.setTileManager(this);
	}
	public void checkTile(int x, int y){
		if(player.canMove()){
			upDateTiles(x, y);
		}
		else {
			player.setTempX(player.getMyX());
			player.setTempY(player.getMyY());
		}
	}
	public void upDateTiles(int pX, int pY){
		List<Tile> oldTiles = World.getWorld().getObjects(Tile.class);
		for (Tile t : oldTiles){
			World.getWorld().removeObject(t);
		}
		int[][] tileMap = chunk.tileMap;
		for (int x = 0; x < World.getW(); x++){
			for (int y = 0; y < World.getH(); y++){
				try {
					tiles[x][y] = getTileByID(tileMap[pX + 17 + x][pY + 17 + y], x, y);
				} 
				catch (ArrayIndexOutOfBoundsException e){
					tiles[x][y] = new Void(World.getWorld(), x, y);
				}
			}
		}
	}
	public Tile getTileByID(int i,int x, int y){
		Tile tile = null;
		switch(i){
			case 0:
				tile = new Grass(World.getWorld(), x, y);
				break;
			case 1:
				tile = new Lava(World.getWorld(), x, y);
				break;
			default:
				System.out.println("not a tile");
		}
		return tile;
	}
}	
