package test02;

public class Son extends Father{
	Son(){
		System.out.println("난 아들 생성자!");
		test();
	}
	
	public void test() {
		System.out.println("아들 테스트");
	}
}
