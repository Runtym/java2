package test02;

public class ObjectTest4 {
	private int speed;
	private int power;
	private String heroName;
	
	public ObjectTest4(int speed, int power, String heroName) {
		this.speed = speed;
		this.power = power;
		this.heroName = heroName;
	}
	
	
	public String toString() {
		return "���̸��� " + this.heroName + "�̸� " + this.power
				+ "������ ���� " + this.speed + "������ ������";
	}
	
	public static void main(String[] args) {
		ObjectTest4[] ot4s = new ObjectTest4[2];
		ot4s[0] = new ObjectTest4(10,10,"ȫ�浿");
		ot4s[1] = new ObjectTest4(20,20,"�Ӳ���");
		
		for(ObjectTest4 ot4 : ot4s) {
			System.out.println(ot4);
		}
		
	}
}
