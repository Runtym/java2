package test01;

public class Calc {
	
	private int add(int n1, int n2) {
		return n1+n2;
	}
	public int minus(int n1, int n2) {
		return n1-n2;
	}
	int multiple(int n1, int n2) {
		return n1* n2;
	}
	int divide(int n1, int n2) {
		return n1/n2;
	}
	
	public static void main(String[] args) {
		Calc c = new Calc();
		int result = c.add(1, 2);
		System.out.println(result);
		result = c.minus(5, 2);
		System.out.println(result);
		result = c.multiple(5, 2);
		System.out.println(result);
		result = c.divide(5, 2);
		System.out.println(c.divide(5, 2));
	}
}
