package test02;

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
	public int indexOf(String s) {
		for(int i=0;i<strs.length;i++) {
			if(s.equals(strs[i])) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		ListTest lt = new ListTest();
		System.out.println(lt.size());
		lt.add("a");
		lt.add("23");
		lt.add("adfsas");
		lt.add("bv");
		lt.add("aaa");
		System.out.println(lt.size());
		System.out.println(lt);
		System.out.println(lt.indexOf("23"));
	}
}
