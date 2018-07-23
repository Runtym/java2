package test03;

import java.util.ArrayList;
import java.util.Collections;

public class ListTest02 {
	public static void main(String[] args) {
		ArrayList<Integer> numList
		= new ArrayList<Integer>();
		numList.add(1);
		numList.add(5);
		numList.add(3);
		Collections.sort(numList);
		
		for(int i=0;i<numList.size();i++) {
			System.out.println(i+1 +"번째 값 : " + numList.get(i));
		}
		
		Collections.reverse(numList);
		
		for(int i=0;i<numList.size();i++) {
			System.out.println(i+1 +"번째 값 : " + numList.get(i));
		}
	}
}
