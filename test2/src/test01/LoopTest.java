package test01;

public class LoopTest {
	
	public static void main(String[] args) {
		for(int i=2;i<=10;i++) {
			if(i%2==0) {
				System.out.println("Â¦¼ö");
			}else if(i%2==1){
				System.out.println("È¦¼ö1");
			}else if(i%2==1){
				System.out.println("È¦¼ö2");
			}else {				
				System.out.println("È¦¼ö3");
			}
		}
	}
}
