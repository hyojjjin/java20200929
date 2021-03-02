package chap06.김효진.exercises2.p19;

public class AccountExample {
	public static void main(String[] args) {
	//balance 필드는 음수값이 될 수 없고
	//최대 100만원까지 저장 가능
	//외부에서 마음대로 필드를 변경하지 x
	//0<=balance<=1,000,000 범위
	
	Account account = new Account();
	
	account.setBalance(10000);
	System.out.println("현재 잔고:" + account.getBalance());

	account.setBalance(-100);
	System.out.println("현재 잔고:" + account.getBalance());

	account.setBalance(2000000);
	System.out.println("현재 잔고:" + account.getBalance());
	
	account.setBalance(300000);
	System.out.println("현재 잔고:" + account.getBalance());
	
	
		
	}
}
