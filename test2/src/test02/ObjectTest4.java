package test02;

public class ObjectTest4 {
	private int speed;
	private int power;
	private String heroName;
	
	
	
	public String toString() {
		return "���̸��� " + this.heroName + "�̸� " + this.power
				+ "������ ���� " + this.speed + "������ ������";
	}
	
	public static void main(String[] args) {
		ObjectTest4[] ot4s = new ObjectTest4[2];
		ot4s[0] = new ObjectTest4();
		String str = ot4s[0].toString();
		System.out.println(str);
	}
}
