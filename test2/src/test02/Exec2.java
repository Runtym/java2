package test02;

public class Exec2 {
//Dog 클래스를 생성해서
//Action interface 구현하여
// printObject로 정보를 찍어보시기 바래요~
	public static void printObject(Action p) {
		p.run();
		p.walk();
		p.sleep();
	}

	public static void main(String[] args) {
		Person person = new Person("홍길동",33);
		printObject(person);
		Cat c = new Cat("동동이", 22);
		c.name = "라라라~";
		c.age = 30;
		printObject(c);
		Dog d = new Dog("카드", 22);
		printObject(d);
	}
}
