package test02;

public class Dog implements Action {
	private String name;
	private int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public static void pr(Object o) {
		System.out.println(o);
	}
	@Override
	public void sleep() {
		pr("�� " + this.name + "�� ��ϴ�.");
	}

	@Override
	public void run() {
		pr("�� " + this.name + "�� �ݴϴ�.");
	}

	@Override
	public void walk() {
		pr(this.age + "�� �� " + this.name + "�� �Ƚ��ϴ�.");
	}

	@Override
	public void wakeUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breakUp() {
		// TODO Auto-generated method stub
		
	}}
