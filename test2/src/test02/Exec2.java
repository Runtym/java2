package test02;

public class Exec2 {
//Dog Ŭ������ �����ؼ�
//Action interface �����Ͽ�
// printObject�� ������ ���ñ� �ٷ���~
	public static void printObject(Action p) {
		p.run();
		p.walk();
		p.sleep();
	}

	public static void main(String[] args) {
		Person person = new Person("ȫ�浿",33);
		printObject(person);
		Cat c = new Cat("������", 22);
		printObject(c);
	}
}
