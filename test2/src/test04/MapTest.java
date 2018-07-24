package test04;

public class MapTest {
	
	public String[] keys;
	public String[] values;
	
	public MapTest() {
		keys = new String[0];
		values = new String[0];
	}
	public boolean put(String key, String value) {
		int idx = indexOf(key);
		if(idx==-1) {
			String[] tmp = keys;
			keys = new String[keys.length+1];
			for(int i=0;i<tmp.length;i++) {
				keys[i] = tmp[i];
			}
			keys[keys.length-1] = key;
			
			tmp = values;
			values = new String[values.length+1];
			for(int i=0;i<tmp.length;i++) {
				values[i] = tmp[i];
			}
			values[values.length-1] = value;
		}else {
			values[idx] = value;
		}
		return true;
	}
	
	public int indexOf(String key) {
		for(int i=0;i<keys.length;i++) {
			if(keys[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}
	
	public String toString() {
		String str = "{";
		for(int i=0;i<keys.length;i++) {
			str += keys[i] +":"+values[i] + ",";
		}
		str = str.substring(0,str.length()-1);
		str += "}";
		return str;
	}
	public static void main(String[] args) {
		MapTest mt =new MapTest();
		mt.put("이름", "박경훈");
		mt.put("나이","33");
		mt.put("주소", "서울강서구");
		mt.put("나이", "22");
		System.out.println(mt);
		
	}
}
