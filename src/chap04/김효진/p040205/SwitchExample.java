package chap04.김효진.p040205;

public class SwitchExample {
	public static void main(String[] args) {
		//switch문을 사용해서 주사위 번호 하나 뽑기
		int num = (int)(Math.random()*6) + 1;
		
		switch(num) {
			case 1 :
				System.out.println("1");
				break;
			case 2 :
				System.out.println("2");
				break;
			case 3 :
				System.out.println("3");
				break;
			case 4 :
				System.out.println("4");
				break;
			case 5 :
				System.out.println("5");
				break;
			case 6 :
				System.out.println("6");
				break;
				
				
		}
	}

}
