package test03;

public class Person implements Comparable<Person>{
	private String name;
	private int age;
	private int point;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public int compareTo(Person o) {
		if(this.age<o.getAge()) {
			return -1;
		}else if(this.age>o.getAge()) {
			return 1;
		}
		return 0;
	}
	
}
