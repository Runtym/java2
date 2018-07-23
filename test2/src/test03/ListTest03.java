package test03;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.commons.lang3.StringUtils;

public class ListTest03 {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		// (int)(Math.random()*30)+1
		// 반복문을 사용해서 1~30까지의 랜덤숫자를
		// 총 10개를 strList에 추가해주세요.
		// 그리고 출력해주세요.
		
		for(int i=1;i<=10;i++) {
			String rNum = (int)(Math.random()*30)+1 +"";
			rNum = StringUtils.leftPad(rNum, 2,'0');
			strList.add(rNum);
		}
		Collections.sort(strList);

		for(int i=0;i<10;i++) {
			System.out.println(strList.get(i));
		}
	}
}
