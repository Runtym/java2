package test02;

import java.util.ArrayList;

public class ListTest {
	private String[] strs = new String[0];
	private int size = 0;
	
	public boolean add(String s) {
		String[] tmps = strs;
		strs = new String[++size];
		for(int i=0;i<tmps.length;i++) {
			strs[i] = tmps[i];
		}
		strs[size-1] = s;
		return true;
	}
	public int size() {
		return size;
	}
	public String get(int idx) {
		return strs[idx];
	}
	
	public String toString() {
		String str = "[";
		for(String s:strs) {
			str += s+",";
		}
		str = str.substring(0,str.length()-1);
		str += "]";
		return str;
	}
	public static void main(String[] args) {
		ListTest lt = new ListTest();
		System.out.println(lt.size());
		lt.add("abc");
		lt.add("abc");
		lt.add("abc");
		lt.add("abc");
		lt.add("abc");
		System.out.println(lt.size());
		System.out.println(lt);
	}
}
