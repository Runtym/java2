package test04;

import java.util.ArrayList;
import java.util.HashMap;

public class ListMapTest {

	public static void main(String[] args) {
		ArrayList<HashMap<String,String>> gameList = 
				new ArrayList<HashMap<String,String>>();
		
		HashMap<String,String> game1 = new HashMap<String,String>();
		game1.put("�����̸�", "StarCraft");
		game1.put("����Ÿ��", "RTS");
		gameList.add(game1);

		HashMap<String,String> game2 = new HashMap<String,String>();
		game2.put("�����̸�", "LOL");
		game2.put("����Ÿ��", "AOS");
		gameList.add(game2);

		HashMap<String,String> game3 = new HashMap<String,String>();
		game3.put("�����̸�", "OverWatch");
		game3.put("����Ÿ��", "FPS");
		gameList.add(game3);
		
		for(int i=0;i<gameList.size();i++) {
			System.out.println(gameList.get(i));
		}
	}
}
