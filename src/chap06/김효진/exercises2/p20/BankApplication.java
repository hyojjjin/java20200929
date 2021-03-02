package chap06.김효진.exercises2.p20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int size = 0;
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("----------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("----------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
		}
	}
		System.out.println("프로그램 종료");
	}
	
	
	
	//계좌 생성하기
	private static void createAccount()	{
		//작성 위치	
		int balance = 0;

		System.out.print("계좌번호 : ");
		String ano = scanner.next();

		System.out.print("계좌주 : ");
		String name = scanner.next();

		System.out.print("초기 입금액 : ");
		balance += scanner.nextInt();
		
		System.out.println("결과 : 계좌가 생성되었습니다.");
		
		Account account = new Account(ano, name, balance);
		accountArray[size] = account;
		size++;
	}
	
	
	//계좌 목록 보기
	private static void accountList() {
		for(int i = 0; i < size; i++) {
			Account acc = accountArray[i];
			System.out.println(acc.getAno() + "\t" + acc.getOwner()+ "\t" + acc.getBalance());
		}
		
		//작성 위치
	}
	
	//예금하기
	private static void deposit() {
		int mon = 0;
		
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		
		Account find = findAccount(ano);
		
		System.out.print("입금액 : ");
		mon = scanner.nextInt();
		
		
		find.setBalance(find.getBalance() + mon);
		
		
		System.out.println("결과 : 입금이 성공되었습니다.");
		
		//작성 위치
	}
	
	//출금 하기
	private static void withdraw() {
		int mon = 0;
		System.out.print("계좌번호");
		String ano = scanner.next();
		
		Account find = findAccount(ano);
		
		System.out.print("출금액");
		mon = scanner.nextInt();
		
		if(find.getBalance() < mon) {
			System.out.println("잔고가 부족합니다.");
		} else {
		find.setBalance(find.getBalance() - mon);
		}
		
		//작성 위치
	}
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		//작성 위치
		for(int i = 0; i < size; i++) {
			if(accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		return null;
	}
}
