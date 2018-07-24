package test03;

import java.util.ArrayList;
import java.util.Collections;

public class Exec {
	public static void main(String[] args) {
		ArrayList<Person> pList = new ArrayList<Person>();
		for(int i=0;i<5;i++) {
			Person p = new Person();
			String name = "�׽�Ʈ" + (i+1);
			int age  = (int)(Math.random()*30)+1;
			p.setName(name);
			p.setAge(age);
			pList.add(p);
		}
		Collections.sort(pList);
		System.out.println("���� ���� ����!");
		for(int i=0;i<5;i++) {
			Person p1 = pList.get(i);
			System.out.println(p1.getName() + "," + p1.getAge());
		}
		
		Collections.reverse(pList);
		System.out.println("���� ���� ����!");
		for(int i=0;i<5;i++) {
			Person p1 = pList.get(i);
			System.out.println(p1.getName() + "," + p1.getAge());
		}
		
	}
}
