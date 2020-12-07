package chap06.김효진.exercises.p20;

import java.util.Scanner;


public class BankApplication {
	
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int size = 0;
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			
			
			int selectNo = scanner.nextInt();
			
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2 ) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	
	//계좌 생성하기
	private static void createAccount() {
		System.out.println("------");
		System.out.println("계좌 생성");
		System.out.println("------");
		
		
		String ano;
		String owner;
		int mon;
	
		
		System.out.print("계좌번호 :");	
		ano = scanner.next();
		System.out.print("계좌주 :");
		owner = scanner.next();
		System.out.print("초기금액 :");	
		mon = scanner.nextInt();
		
		
		Account account = new Account(ano, owner, mon);
		accountArray[size] = account;
		size++;
		
		System.out.println("결과 : 계좌가 생성되었습니다.");
	
		}
	

	
	
	//계좌 목록보기
	private static void accountList() {
		
		//작성 위치
		System.out.println("------");
		System.out.println("계좌 목록");
		System.out.println("------");
	
	
		for(int i = 0; i < size; i++) {
			Account cur = accountArray[i];
			System.out.println(cur.getAno() + "\t" + cur.getOwner() + "\t" + cur.getBalance());
	
			}
		
	}
	
	
	//예금하기
	private static void deposit() {
		//작성 위치
		System.out.println("------");
		System.out.println("계좌 목록");
		System.out.println("------");
	
		String ano;
		int mon;
		
		
		System.out.println("계좌번호");
		ano = scanner.next();
		System.out.println("예금액");
		mon = scanner.nextInt();
		
		
		
		Account cur = findAccount(ano);
		int sum = cur.getBalance() + mon;
		cur.setBalance(sum);
		
		System.out.println("예금이 성공되었습니다.");
	
		
	}
	
		private static Account findAccount(String ano) {
			for(int i = 0; i < size; i++) {
				if(accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
				}
			} return null;
			
		}
		
	
		
	
	
	//출금하기
	private static void withdraw() {
		String ano;
		int mon;
		
		
		System.out.println("계좌번호");
		ano = scanner.next();
		System.out.println("출금액");
		mon = scanner.nextInt();
		
		
		
		Account cur = findAccount(ano);
		int sum = cur.getBalance() - mon;
		cur.setBalance(sum);
		
		System.out.println("출금이 성공되었습니다.");
	
	}
	

}
