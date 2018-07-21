package test02;

class Test{
	public final void test() {
		System.out.println("abc");
	}
}
public class FinalTest extends Test{
	public static final int NUM_TEST = 1;
	
	public static void main(String[] args) {
		System.out.println(FinalTest.NUM_TEST);
	}
}
