package test01;

public class ClassTest {
	int a;
	
	ClassTest(){
		System.out.println("ct�⺻");
		System.out.println(a);
	}
	ClassTest(int a){
		System.out.println("ct int������");
	}
	ClassTest(String s){
		System.out.println("ct String������");
	}
	
	
	void test() {
		System.out.println("���� �׽�Ʈ �Լ��Դϴ�.");
	}
	void test(int a) {
		System.out.println("���� �׽�Ʈ ��Ʈ �Լ��Դϴ�.");
	}
	int test(String s) {
		return 0;
	}
	ClassTest test(boolean b) {
		return this;
	}
	String test(double b) {
		return "abc";
	}
	public static void main(String[] args) {
		ClassTest ct = new ClassTest();
		ct.test();
		int a = ct.test("abc");
		String str = ct.test(1.2);
		
	}
	
}
