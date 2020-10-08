package chap04.exercises;

import java.util.Scanner;

public class exercise07 {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택>");
			
	
			String m = scanner.nextLine();
			int m1 = Integer.valueOf(m);
			
			if (m1 == 1) {
			
			System.out.print("예금액>");
			String a =scanner.nextLine();
			int a1 = Integer.valueOf(a);
			balance +=a1;	
			
		} else if (m1 == 2) {
			System.out.print("출금액>");
			String b =scanner.nextLine();
			int b1 = Integer.valueOf(b);
			balance -=b1;
			
		} else if (m1 == 3) {
			System.out.print("잔고>");
			System.out.println(balance);
	
		}  else if (m1 == 4) {
			run = false;
		}
		
			
		}	
		System.out.println("프로그램 종료");
	}
	
	}
	

