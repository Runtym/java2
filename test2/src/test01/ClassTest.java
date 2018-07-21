package test01;

public class ClassTest {
	int a;
	
	ClassTest(){
		System.out.println("ct기본");
		System.out.println(a);
	}
	ClassTest(int a){
		System.out.println("ct int생성자");
	}
	ClassTest(String s){
		System.out.println("ct String생성자");
	}
	
	
	void test() {
		System.out.println("전는 테스트 함수입니다.");
	}
	void test(int a) {
		System.out.println("저는 테스트 인트 함수입니다.");
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
