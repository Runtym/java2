package test04;

import java.util.ArrayList;
import java.util.HashMap;

public class MapTest3 {

	public static void main(String[] args) {
		HashMap<String, String> animal =
				new HashMap<String,String>();
		animal.put("�����̸�", "�����");
		animal.put("��������", "3");
		
		ArrayList<HashMap<String, String>> animalList = 
				new ArrayList<HashMap<String, String>>();
		animalList.add(animal);
		
		animal = new HashMap<String,String>();
		animal.put("�����̸�", "���þȺ��");
		animal.put("��������", "4");
		animalList.add(animal);
		
		animal = new HashMap<String,String>();
		animal.put("�����̸�", "�ױ۸�����ī");
		animal.put("��������", "2");
		animalList.add(animal);
		
		animal = new HashMap<String,String>();
		animal.put("�����̸�", "�丣�þ�");
		animal.put("��������", "7");
		animalList.add(animal);
		
		for(HashMap<String,String> hm:animalList) {
			System.out.println(hm);
		}
	}
}
