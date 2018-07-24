package test04;

import java.util.ArrayList;
import java.util.HashMap;

public class MapTest3 {

	public static void main(String[] args) {
		HashMap<String, String> animal =
				new HashMap<String,String>();
		animal.put("동물이름", "요쿠셔");
		animal.put("동물나이", "3");
		
		ArrayList<HashMap<String, String>> animalList = 
				new ArrayList<HashMap<String, String>>();
		animalList.add(animal);
		
		animal = new HashMap<String,String>();
		animal.put("동물이름", "러시안블루");
		animal.put("동물나이", "4");
		animalList.add(animal);
		
		animal = new HashMap<String,String>();
		animal.put("동물이름", "잉글리쉬코카");
		animal.put("동물나이", "2");
		animalList.add(animal);
		
		animal = new HashMap<String,String>();
		animal.put("동물이름", "페르시안");
		animal.put("동물나이", "7");
		animalList.add(animal);
		
		for(HashMap<String,String> hm:animalList) {
			System.out.println(hm);
		}
	}
}
