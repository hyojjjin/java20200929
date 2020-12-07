package chap04.김효진.p040205;

public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
//브릭 문이 없는 switch case문
		int time = (int)(Math.random()*4) + 8;
		System.out.println("[현재시간 : " + time + "시]");
	
		switch(time) {
		case 8 :
			System.out.println("출근합니다.");
			
		case 9 :
			System.out.println("회의합니다.");
			
		case 10 :
			System.out.println("업무를 봅니다.");
			
		case 11 :
			System.out.println("외근갑니다.");
			
		}	
	}

}
