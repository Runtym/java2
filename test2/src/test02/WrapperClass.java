package test02;

public class WrapperClass {

	public static void main(String[] args) {
		int a = 3;
		Integer in = a;
		long l = 10;
		Long lo = l;
		double d = 1.1;
		Double dou = d;
		
		char c = 'a';
		Character ch = c;
		
		boolean bl = true;
		Boolean bool = bl;
		String str = bool.toString();
		System.out.println(str);
	}
}
