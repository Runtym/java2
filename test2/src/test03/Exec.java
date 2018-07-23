package test03;

import java.util.ArrayList;

public class Exec {
	public static void main(String[] args) {
		ArrayList<Person> pList = new ArrayList<Person>();
		Person p = new Person();
		for(int i=0;i<5;i++) {
			String name = "Å×½ºÆ®" + (i+1);
			int age  = (i+1) *10;
			p.setName(name);
			p.setAge(age);
			pList.add(p);
		}
		
		for(int i=0;i<5;i++) {
			Person p1 = pList.get(i);
			System.out.println(p1.getName() + "," + p1.getAge());
		}
		
	}
}
