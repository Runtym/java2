package test02;

public class ObjectTest3 {
	private int age;
	private String name;
	
	public ObjectTest3(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public String toString() {
		return "이름 : " + this.name + ", 나이 : " + this.age;
	}
	public static void main(String[] args) {
		System.out.println(new ObjectTest3(22,"홍길동"));
		System.out.println(new ObjectTest3(32,"이길동"));
		System.out.println(new ObjectTest3(42,"오길동"));
	}
}
