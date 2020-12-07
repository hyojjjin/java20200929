package chap06.김효진.exercises.p19;

public class Account {

	private int balance;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	public int setBalance(int a) {
		if (a > MIN_BALANCE && a < MAX_BALANCE) {
			balance += a;
		} return balance;
	}

	public int getBalance() {
		return balance;
	}

}
