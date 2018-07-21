package test02;

public class ObjectTest {
	public int a;
	public ObjectTest(int a) {
		this.a = a;
	}
	public boolean test(ObjectTest ot) {
		return this.a == ot.a;
	}
	
	public static void main(String[] args) {
		ObjectTest ot1 = new ObjectTest(2);
		ObjectTest ot2 = new ObjectTest(2);
		System.out.println(ot1.test(ot2));
		
		String str1 ="1";
		String str2 = new String("1");
		System.out.println(str1.equals(str2));
	}
}
