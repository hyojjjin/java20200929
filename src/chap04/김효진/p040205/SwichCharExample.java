package chap04.김효진.p040205;

public class SwichCharExample {
	public static void main(String[] args) {
		//char 타입의 Switch문
		char grade = 'B';
		
		switch(grade) {
			case 'A' :
			case 'a' :
				System.out.println("우수회원");
				break;

			case 'B' :
			case 'b' :
				System.out.println("일반회원");
				break;
			
			default:
				System.out.println("손님");
		}
	}
}
