package test02;

public class Person implements Action {
	private String name;
	private int age;
	
	public static void pr(Object o) {
		System.out.println(o);
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public void sleep() {
		pr(this.name + "¥‘¿Ã ¿‚¥œ¥Ÿ.");
	}

	@Override
	public void run() {
		pr(this.name + "¥‘¿Ã ∂›¥œ¥Ÿ.");
	}

	@Override
	public void walk() {
		pr(this.age + "ªÏ " + this.name + "¥‘¿Ã ∞»Ω¿¥œ¥Ÿ.");
	}

	@Override
	public void wakeUp() {
		// TODO Auto-generated method stub

	}

	@Override
	public void breakUp() {
		// TODO Auto-generated method stub

	}
}
