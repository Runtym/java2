package test03;

import java.util.ArrayList;
import java.util.HashMap;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String,String> personInfo = 
				new HashMap<String,String>();
		personInfo.put("�̸�", "ȫ�浿");
		personInfo.put("����", "33");
		personInfo.put("�ּ�", "����");
		
		System.out.println(personInfo);
		
		String age = personInfo.get("����");
		System.out.println("personInfo�� ���� : " + age);
		ArrayList<HashMap<String,String>> al = 
				new ArrayList<HashMap<String,String>>();
		al.add(personInfo);
		
	}
}
