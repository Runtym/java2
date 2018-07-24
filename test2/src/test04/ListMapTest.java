package test04;

import java.util.ArrayList;
import java.util.HashMap;

public class ListMapTest {

	public static void main(String[] args) {
		ArrayList<HashMap<String,String>> gameList = 
				new ArrayList<HashMap<String,String>>();
		
		HashMap<String,String> game1 = new HashMap<String,String>();
		game1.put("게임이름", "StarCraft");
		game1.put("게임타입", "RTS");
		gameList.add(game1);

		HashMap<String,String> game2 = new HashMap<String,String>();
		game2.put("게임이름", "LOL");
		game2.put("게임타입", "AOS");
		gameList.add(game2);

		HashMap<String,String> game3 = new HashMap<String,String>();
		game3.put("게임이름", "OverWatch");
		game3.put("게임타입", "FPS");
		gameList.add(game3);
		
		for(int i=0;i<gameList.size();i++) {
			System.out.println(gameList.get(i));
		}
	}
}
