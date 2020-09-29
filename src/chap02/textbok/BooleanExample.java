package chap02.textbok;

public class BooleanExample {
	public static void main(String[] args) {
		boolean stop = true;
		//true면 if문이 참이 되어 "중지합니다."
		//false면 if문은 펄스로 넘어가고, else문을 만나서 "시작합니다."
		
		if(stop) {
			System.out.println("중지합니다.");
			
		} else {
			System.out.println("시작합니다.");
		
			
		}
	}
}
