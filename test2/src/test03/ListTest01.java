package test03;

import java.util.ArrayList;

public class ListTest01 {
	static void getNum() {
		return;
		
	}

	public static void main(String[] args) {
		String[] arr= {"나","너","니"};
		System.out.println(arr);
		ArrayList<String> al;
		al = new ArrayList<String>();
		al.add("나");
		al.add("너");
		al.add("니");
		System.out.println(al);
	}
}
