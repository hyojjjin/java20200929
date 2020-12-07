package chap04.김효진.exercises;

import java.util.Scanner;

public class p07 {
	public static void main(String[] args) {		
	//while문과 Scanner 이용
	//예금, 출금, 조회, 종료 가능을 제공하는 코드 작성
	
		boolean run = true;
		
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		int s;
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------");
			System.out.print("선택 >");
			
			s = scanner.nextInt();
			
			if(s == 1) {
				System.out.print("예금액 >");
				balance += scanner.nextInt();
			} else if(s == 2) {
				System.out.println("출금액>");
				balance -= scanner.nextInt();
			} else if(s == 3) {
				System.out.println("잔고 >" + balance);
			} else if (s == 4){
				break;
			}
		
		}
		System.out.println("프로그램 종료");

	}
}
