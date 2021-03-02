package chap06.김효진.exercises2.p19;

public class Account {

	public int balance;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	public int getBalance() {
		return balance;
	}

	public int setBalance(int a) {
		if (a > MIN_BALANCE && a < MAX_BALANCE) {
			return balance = a;
		}
		return balance;
	}

}
